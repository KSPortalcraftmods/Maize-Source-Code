// Legend 
// Pixels=PX
// KSPortalcraft + Jimbo Devolpment
// People who are decompiling this game hi (:
// 768x576 pixel game 
// Last Edited 26/11/2022


package main;

import java.awt.Color;
import java.awt.Dimension; // controls line 30
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel; //controls most of the game

import entity.Player;
import object.SuperObject;
import tile.TileManager;

public class GamePanel extends JPanel implements Runnable{
	
	// SCREEN SETTINGS
	final int originalTitleSize = 16; // 16x16 tile
	final int scale = 3;
	
	public final int tileSize = originalTitleSize * scale; // 48x48 
	public final int maxScreenCol =16;
	public final int maxScreenRow = 12;
	public final int screenWidth = tileSize * maxScreenCol; // 768px
	public final int screenHeight = tileSize * maxScreenRow; // 576px
	
	// WORLD SETTINGS
	
	public final int maxWorldCol = 50;
	public final int maxWorldRow = 50;

	
	// FPS
	
	int FPS = 60;
	
	// SYSTEM
	
	TileManager tileM = new TileManager(this);
	KeyHandler keyH = new KeyHandler();	
    Sound music = new Sound();
    Sound se = new Sound();
	public CollisionChecker cChecker = new CollisionChecker(this);
	public AssetSetter aSetter = new AssetSetter(this);
	public UI ui = new UI(this);
	Thread gameThread;	
	
	// ENTITY AND OBJECT
	public Player player = new Player(this,keyH);
	public SuperObject obj[] = new SuperObject[15]; //keep for now, but if you do add a lot of other stuff change it 
	
	

	
	public GamePanel() {
		
		
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true); // Improves pofremance If set to true, all drawings from this componet will be done in an offscreen paint buffer use for debugging
		this.addKeyListener(keyH);
		this.setFocusable(true);
	}
	
	public void setupGame() {
		
		aSetter.setObject();
		
		playMusic(0);
		
		
	}
	
	public void startGameThread()  {
		
		
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	
	

	@Override
	
// Old and Dead Gamethread Loop Thing	
// 	
//	public void run() {
//		
//		 
//		double drawInterval = 1000000000/FPS;  //0.0166666ish seconds
//		double nextDrawTime = System.nanoTime() + drawInterval;
//		long timer = 0;
//		int drawCount =0;
//		
//		
//		while(gameThread != null) {
//					
//		    
//			update();
//			
//	
//		    	
//			repaint();
//				
//			try {
//				double remainingTime = nextDrawTime - System.nanoTime(); 
//				remainingTime = remainingTime/1000000;
//			
//				if(remainingTime < 0) {
//					remainingTime = 0;
//					
//				}
//				
//				Thread.sleep((long) remainingTime);
//				
//				nextDrawTime += drawInterval;
//				
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		    }
//			
//		}
	
	    
	   public void run() {
		
		double drawInterval = 1000000000/FPS;
		double delta = 0;
		long lastTime = System.nanoTime(); 
		long currentTime;
		long timer = 0;
		int drawCount = 0;
				
		while(gameThread != null) {
			
			currentTime = System.nanoTime();
			
			delta += (currentTime - lastTime) / drawInterval;
			timer += (currentTime - lastTime);
			lastTime = currentTime;
			
			
			if(delta >= 1) {
				
				update();
				repaint();
				delta--;
				drawCount++;
				
			}			
			
			if(timer >= 1000000000) {
				System.out.println("FPS:" + drawCount);
				drawCount = 0;
				timer = 0;
				
			}
		}
		
	}
	
	

		public void update() {
			
    
	             player.update();		
				
			}
		
					
		public void paintComponent (Graphics g) {
			
			
			super.paintComponent(g);
			
			Graphics2D g2 = (Graphics2D)g;
			
			//TILE
			tileM.draw(g2); 
			
			//OBJECT
			for(int i = 0; i < obj.length; i++) { //scans from 0-9, then checks if there is an object, then draws aka it checks if its null or not as to not get a null point error.
				if(obj[i] != null) {
					obj[i].draw(g2, this);
				}
			}
			
			
			//PLAYER
			player.draw(g2);
			
			// UI
			
			ui.draw(g2);
			
			g2.dispose();
		}
		public void playMusic(int i) {
			
			music.setFile(i);
			music.play();
			music.loop();
			
		}
		
		public void stopMusic() {
			
			music.stop();
			
		}
		
		public void playSE(int i) {
			
			se.setFile(i);
			se.play();
			
		}
 	
}
