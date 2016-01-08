package game;

/**
 * The opposite from BuyableField. All fields that can be accessed by the
 * player which can't be bought.
 * 
 * @author Trickels
 *
 */

public class PublicField extends Field {
	private PublicFieldType type;
	
	public PublicField (String name, PublicFieldType type) {
		this.name = name;
		this.type = type;
	}

	public PublicFieldType getType() {
		return type;
	}
	
	
}
