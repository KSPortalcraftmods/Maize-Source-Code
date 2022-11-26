package tile;

import java.awt.Graphics2D;
import java.awt.image.ImageObserver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

import main.GamePanel;

public class TileManager  {

	GamePanel gp;
	Tile[] tile;
	int mapTileNum[][];
	
	
	
	public TileManager(GamePanel gp) {
		
		this.gp = gp;
		
		tile = new Tile[10];
		mapTileNum = new int[gp.maxWorldCol][gp.maxWorldRow];
		
		getTileImage();
		loadMap("/maps/world01.txt");
		
	}
	
	public void getTileImage() {
		
		try {
			
			tile[0] = new Tile();
			tile[0].image = ImageIO.read(getClass().getResourceAsStream("/tiles/hellgrass.png"));
			
			tile[1] = new Tile();
			tile[1].image = ImageIO.read(getClass().getResourceAsStream("/tiles/wall.png"));
			
			tile[2] = new Tile();
			tile[2].image = ImageIO.read(getClass().getResourceAsStream("/tiles/lava.png"));
			
			tile[3] = new Tile();
			tile[3].image = ImageIO.read(getClass().getResourceAsStream("/tiles/hellearth.png"));
			
			
			tile[4] = new Tile();
			tile[4].image = ImageIO.read(getClass().getResourceAsStream("/tiles/helltree.png"));
									
			tile[5] = new Tile();
			tile[5].image = ImageIO.read(getClass().getResourceAsStream("/tiles/hellsand.png"));
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void loadMap(String filePath) { 
		
		try {
			InputStream is = getClass().getResourceAsStream(filePath);
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			int col = 0;
			int row = 0;
			
			while(col < gp.maxWorldCol && row < gp.maxWorldRow) {
				
				String line = br.readLine();
				
				while(col < gp.maxWorldCol) {
					
					String numbers[] = line.split(" ");
					
					int num = Integer.parseInt(numbers[col]);
					
					mapTileNum[col] [row] = num;
					col++;
				}
				
				if(col == gp.maxWorldCol) {
					
					col = 0;
				    row ++ ;				
			}
	
		}
			br.close();	

			
		}catch (Exception e) {
			
		}
				
		
		
		
	}
	
	public void draw(Graphics2D g2) {
		
		
		int worldCol = 0; // named world as it fits within naming doesnt 100% need to have world in it.
		int worldRow = 0;

		
		while(worldCol < gp.maxWorldCol && worldRow < gp.maxWorldRow) {
			
			int tileNum = mapTileNum[worldCol] [worldRow];
			
			int worldX = worldCol * gp.tileSize;
			int worldY = worldRow * gp.tileSize;
			int screenX = worldX - gp.player.worldX + gp.player.screenX;
			int screenY = worldY - gp.player.worldY + gp.player.screenY;
			
			if(worldX + gp.tileSize > gp.player.worldX - gp.player.screenX &&
					worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&  // The small mess of code to improve rendering by only rendering on screen tiles.
					worldY +  gp.tileSize > gp.player.worldY - gp.player.screenY && // The  gp.tileSize in the if statment makes it so it renders a few other pixels so it there is not a black barreir around the screen, due to the screen only rendering the size
					worldY -  gp.tileSize < gp.player.worldY + gp.player.screenY) {
				
				
				g2.drawImage(tile[tileNum].image, screenX, screenY, gp.tileSize, gp.tileSize, null);
			}
			
			worldCol++;
		
			
			if(worldCol == gp.maxWorldCol) {
				worldCol = 0;
				worldRow++;
		
				
			}
			
		}

	}
	
}
