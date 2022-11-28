package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Slow_Boots extends SuperObject {
	
	
public OBJ_Slow_Boots() {
		
		name = "Slow_Boots";
		try { 
			
			image = ImageIO.read(getClass().getResourceAsStream("/objects/slow_boots.png"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
