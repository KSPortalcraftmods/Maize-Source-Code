//Last Edited 4:30pm 21/11/2022

package main;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Maize: Alpha, V.1.0.0: Are We Alpha Yet?");
		System.out.println("NSA: Spyware Active Have A Nice Day!");
		System.out.println("China Goverment: +1000 Soical Credit Score Chinese Spyware Enable");
		
		
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Maize");
		
		GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);
		
		window.pack();
		// git cloning sucks 
	    window.setLocationRelativeTo(null);
	    window.setVisible(true);
	    
	    gamePanel.startGameThread();
	}

}
  