
package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{
	
	public boolean upPressed, downPressed, leftPressed, rightPressed;
	// DEBUG
	boolean checkDrawTime = false;
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		int code = e.getKeyCode();
		
		if(code == KeyEvent.VK_W) { // moves north
			upPressed = true;						
		}
		
		if(code == KeyEvent.VK_S) { //moves south
			downPressed = true;	
		}
		
		if(code == KeyEvent.VK_A) { //moves east
			leftPressed = true;
		}
		
		if(code == KeyEvent.VK_D) { //moves west
			rightPressed = true;
		}
		
		// DEBUG
		if(code == KeyEvent.VK_T) {
			if(checkDrawTime == false) {
				checkDrawTime = true;
			}
			else if(checkDrawTime == true) {
				checkDrawTime = false;
			}
		}
	
			
			
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
		int code = e.getKeyCode();
		
		if(code == KeyEvent.VK_W) { //Disable
			upPressed = false;		
		}
		
		if(code == KeyEvent.VK_S) { //Disable
			downPressed = false;
		}
		
		if(code == KeyEvent.VK_A) { //Disable
			leftPressed = false;
		}
		
		if(code == KeyEvent.VK_D) { // Disable
			rightPressed = false;
		}
		
	}

}
