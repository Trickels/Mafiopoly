package game;

import java.util.*;

/**
 * Represent the gameboard. The board holds fields.
 * 
 * @author Trickels
 *
 */

public class Board {

	List<Field> board = new ArrayList<Field>(40);
	
	public Board() {
		String[] streetNames = {"Street1","Street2","Street3"
		                        ,"Street4","Street5","Street6"
		                        ,"Street7","Street8","Street9"
		                        ,"Street10","Street11","Street12"
		                        ,"Street13","Street14","Street15"
		                        ,"Street16","Street17","Street18"
		                        ,"Street19","Street20","Street21"
		                        ,"Street22"};
		
		int[][] streetValues = {{1,100,10,20,1},{3,100,10,20,1},{6,180,18,34,1}
								,{8,180,18,34,1},{9,200,20,40,1},{11,220,22,44,2}
								,{13,220,22,44,2},{14,240,24,48,2},{16,260,26,52,2}
								,{18,260,26,52,2},{19,280,28,54,2},{21,300,30,60,3}
								,{23,300,30,60,3},{24,320,32,64,3},{26,340,34,68,3}
								,{27,340,34,68,3},{29,360,36,72,3},{31,380,38,74,4}
								,{32,380,38,74,4},{34,400,40,80,4},{37,430,43,86,4}
								,{39,460,46,92,4}
								}; //{position,buyPrice,visitUnitPrice,visitAllInPrice,severity}
		
		for (int i = 0; i < streetNames.length; i++) {
			board.add(streetValues[i][0], new BuyableField(streetNames[i],BuyableFieldType.STREET,streetValues[i][1], streetValues[i][2], streetValues[i][3], streetValues[i][4]));
		}

		String[] trainStationNames = {"MainStation","Station1","Station2","Station3"};
		int[][] trainStationValues = {{5,300,60,120,0},{15,300,60,120,0},{25,300,60,120,0},{35,300,60,120,0}
				
									}; //{position,buyPrice,visitUnitPrice,visitAllInPrice,severity}
		
		for (int i = 0; i<trainStationNames.length; i++) {
			board.add(trainStationValues[i][0], new BuyableField(trainStationNames[i], BuyableFieldType.TRAINSTATION, trainStationValues[i][1], trainStationValues[i][2], trainStationValues[i][3], trainStationValues[i][4]));
		}
		
		String[] curbNames = {"Curb1","Curb2"};
		int[][] curbValues={{12,250,40,80,0},{28,250,40,80,0}
			
							}; 	//{position,buyPrice,visitUnitPrice,visitAllInPrice,severity}
		
		for (int i = 0; i < curbNames.length; i++) {
			board.add(curbValues[i][0], new BuyableField(curbNames[i], BuyableFieldType.CURB, curbValues[i][1], curbValues[i][2], curbValues[i][3], curbValues[i][4]));
		}
		
		
		int[] clubPositions = {2,7,17,22,33,36};
		for (int i = 0; i < clubPositions.length; i++) {
			board.add(clubPositions[i], new PublicField("Club",PublicFieldType.CLUB));
		}
		
		int[] taxPositions = {4,38};
		for(int i = 0; i < taxPositions.length; i++) {
			board.add(taxPositions[i], new PublicField("Tax",PublicFieldType.TAX));
		}
		
		board.add(0,new PublicField("Home",PublicFieldType.HOME));
		
		board.add(10, new PublicField("Courdroom",PublicFieldType.COURTROOM));
		
		board.add(20, new PublicField("Harbor", PublicFieldType.HABOR));
		
		board.add(30, new PublicField("Trap", PublicFieldType.TRAP));
		
		
	}
}
