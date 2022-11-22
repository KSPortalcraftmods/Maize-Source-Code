//Last Edited 4:30pm 21/11/2022

package main;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.print("Maize: Indev, 0.0.2");
		
		
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Maize");
		
		GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);
		
		window.pack();
		
	    window.setLocationRelativeTo(null);
	    window.setVisible(true);
	    
	    gamePanel.startGameThread();
	}

}
  