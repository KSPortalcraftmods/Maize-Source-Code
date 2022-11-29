package main;

import object.OBJ_Boots;
import object.OBJ_Chest;
import object.OBJ_Door;
import object.OBJ_Key;
import object.OBJ_Slow_Boots;
import object.OBJ_Veggie;

public class AssetSetter {
	
	GamePanel gp;
	
	public AssetSetter(GamePanel gp) {
		this.gp = gp;		
	}
	
	public void setObject() {
		
		gp.obj[0] = new OBJ_Key();
		gp.obj[0].worldX = 23 * gp.tileSize; //This is for the first world map do change for when the map gets redisgned!!!
		gp.obj[0].worldY = 7 * gp.tileSize;  //This is for the first world map do change for when the map gets redisgned!!!
		
		gp.obj[1] = new OBJ_Key();
		gp.obj[1].worldX = 23 * gp.tileSize; //This is for the first world map do change for when the map gets redisgned!!!
		gp.obj[1].worldY = 40 * gp.tileSize; //This is for the first world map do change for when the map gets redisgned!!!
		
		gp.obj[2] = new OBJ_Door();
		gp.obj[2].worldX =  37 * gp.tileSize; //This is for the first world map do change for when the map gets redisgned!!!
		gp.obj[2].worldY =  9 * gp.tileSize; //This is for the first world map do change for when the map gets redisgned!!!
		
		gp.obj[3] = new OBJ_Door();
		gp.obj[3].worldX =  10 * gp.tileSize; //This is for the first world map do change for when the map gets redisgned!!!
		gp.obj[3].worldY =  11 * gp.tileSize; //This is for the first world map do change for when the map gets redisgned!!!
		
		gp.obj[4] = new OBJ_Door();
		gp.obj[4].worldX =  8 * gp.tileSize; //This is for the first world map do change for when the map gets redisgned!!!
		gp.obj[4].worldY =  24 * gp.tileSize; //This is for the first world map do change for when the map gets redisgned!!!
		
		gp.obj[5] = new OBJ_Door();
		gp.obj[5].worldX =  12 * gp.tileSize; //This is for the first world map do change for when the map gets redisgned!!!
		gp.obj[5].worldY =  22 * gp.tileSize; //This is for the first world map do change for when the map gets redisgned!!!
		
		gp.obj[6] = new OBJ_Chest();
		gp.obj[6].worldX =  10 * gp.tileSize; //This is for the first world map do change for when the map gets redisgned!!!
		gp.obj[6].worldY =  7 * gp.tileSize; //This is for the first world map do change for when the map gets redisgned!!!
		
		gp.obj[7] = new OBJ_Veggie();
		gp.obj[7].worldX =  37 * gp.tileSize; //This is for the first world map do change for when the map gets redisgned!!!
		gp.obj[7].worldY =  43 * gp.tileSize; //This is for the first world map do change for when the map gets redisgned!!!
		
		gp.obj[8] = new OBJ_Boots();
		gp.obj[8].worldX =  82/2 * gp.tileSize; //This is for the first world map do change for when the map gets redisgned!!!
		gp.obj[8].worldY =  9 * gp.tileSize; //This is for the first world map do change for when the map gets redisgned!!!
		
		gp.obj[8] = new OBJ_Boots();
		gp.obj[8].worldX =  82/2 * gp.tileSize; //This is for the first world map do change for when the map gets redisgned!!!
		gp.obj[8].worldY =  9 * gp.tileSize; //This is for the first world map do change for when the map gets redisgned!!!
		
		gp.obj[9] = new OBJ_Slow_Boots();
		gp.obj[9].worldX =  47/2 * gp.tileSize; //This is for the first world map do change for when the map gets redisgned!!!
		gp.obj[9].worldY =  35 * gp.tileSize; //This is for the first world map do change for when the map gets redisgned!!!
		
		gp.obj[10] = new OBJ_Key();
		gp.obj[10].worldX =  72/2 * gp.tileSize; //This is for the first world map do change for when the map gets redisgned!!!
		gp.obj[10].worldY =  12 * gp.tileSize; //This is for the first world map do change for when the map gets redisgned!!!
		
	}

}
