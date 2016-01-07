package game;

/**
 * A buyable field defines all fields that can be buy from a player
 * like streets, train stations and so on.
 * 
 * @author Trickels
 *
 */

public class BuyableField extends Field{

	private Player owner; 
	private Industry industry;
	
	private BuyableFieldType type; // 
		
	private int unitPrice;
	private int allInPrice;
	
}
