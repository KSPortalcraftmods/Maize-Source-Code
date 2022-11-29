package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Slow_Boots extends SuperObject {
	
	GamePanel gp;
	
public OBJ_Slow_Boots(GamePanel gp) {
		
		name = "Slow_Boots";
		try { 
			
			image = ImageIO.read(getClass().getResourceAsStream("/objects/slow_boots.png"));
			uTool.scaleImage(image, gp.tileSize, gp.tileSize);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
