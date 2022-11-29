package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Veggie extends SuperObject {
	
public OBJ_Veggie(GamePanel gp) {
		
		name = "Veggie";
		try { 
			
			image = ImageIO.read(getClass().getResourceAsStream("/objects/veggie.png"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
