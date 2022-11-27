package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Veggie extends SuperObject {
	
public OBJ_Veggie() {
		
		name = "Veggie";
		try { 
			
			image = ImageIO.read(getClass().getResourceAsStream("/objects/veggie.png"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
