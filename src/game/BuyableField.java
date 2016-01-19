package game;
import java.util.*;
import game.Exceptions.*;

/**
 * A buyable field defines all fields that can be buy from a player
 * like streets, train stations and so on.
 * 
 * @author Trickels
 *
 */

public class BuyableField extends Field{

	//config
	private final int maxHouses=5;

	
	private Player owner; 
	private Industry industry;	
	private BuyableFieldType type;  
	private String industryDescription;
	
	private int severity;
	private ArrayList<BuyableField> connectedFields = new ArrayList<BuyableField>();
	
	private int houses;
	private int visitUnitPrice;
	private int visitAllInPrice;
	private int visitCurrentPrice;
	private int buyPrice;
	
	
	public BuyableField(String name, BuyableFieldType type, int buyPrice, int visitUnitPrice, int visitAllInPrice ,int severity) {
		this.name = name;
		this.type = type;
		this.severity = severity;
		this.visitUnitPrice = visitUnitPrice;
		this.visitAllInPrice = visitAllInPrice;
		this.buyPrice = buyPrice;
	}

	//SETTER
	//-----------------------------------------------------------------------------------

	/**
	 * Set a new owner from this field.
	 * @param owner The new player who should get the field.
	 */
	public void setOwner(Player owner) {
		this.owner = owner;

	}
	/**
	 * Set a new industry for the field.
	 * @param industry The new industry that the field should be.
	 */
	public void setIndustry(Industry industry) {
		this.industry = industry;
	}
	/**
	 * Set a new list to the field. This list contains all fields that are part of the "block" (all streets from the same color,
	 * all stations together and so on). This is important to calculate the prices of the streets.
	 * @param connectedFields 	A list containing all fields from the same block.
	 */
	public void setConnectedFields(ArrayList<BuyableField> connectedFields) {
		this.connectedFields = connectedFields;
	}
	
	/**
	 * Set a description for the industry. If it is a bank, casino or cathouse the name of
	 * the houses will be stored here (like "RichieRich Bank"). If it is a wharehouse the description
	 * of the drug will be stored (like "Heroin"). 
	 * @param industryDescription	The description or name of the industry
	 */
	public void setIndustryDescription(String industryDescription) {
		this.industryDescription = industryDescription;
	}

	
	//GETTER
	//-----------------------------------------------------------------------------------
	
	/**
	 * Get the type of the field. The types are from the enum BuyableFieldType.
	 * @see BuyableFieldType
	 * @return the BuyableFieldType from the field.
	 */
	public BuyableFieldType getType() {
		return type;
	}

	/**
	 * Get the severity from this field. The severity is a valuation for a street. Streets that
	 * are on the end of the board are more valuation than streets on the beginning.
	 * @return the severity for the street.
	 */
	public int getSeverity() {
		return severity;
	}
	
	/**
	 * Get the count of the houses on this field.
	 * @return the houses of the field.
	 */
	public int getHouses() {
		return houses;
	}
	/**
	 * Get the price of a visit on the field if NOT ALL streets (stations and so on) are owned by this player
	 * and no houses are build on.
	 * @return the single visit price
	 */
	public int getVisitUnitPrice() {
		return visitUnitPrice;
	}
	/**
	 * Get the price of a visit on the field if ALL streets (stations and so on) are owned by this player
	 * and no houses are build on.
	 * @return price for a visit if the block of this field are owned by one player.
	 */
	public int getVisitAllInPrice() {
		return visitAllInPrice;
	}
	/**
	 * Get the price to buy this street.
	 * @return the buy price
	 */
	public int getBuyPrice() {
		return buyPrice;
	}
	/**
	 * Get the actual owner of this field.
	 * @return owner of the field.
	 */
	public Player getOwner() {
		return owner;
	}
	/**
	 * Get the industry of this field. If no industry is set null will be returned. Industry are listed in a enum.
	 * @see Industry
	 * @return the industry of the field
	 */
	public Industry getIndustry() {
		return industry;
	}
	/**
	 * Get the list with all fields of the block from this field. A block is all streets with the same color, all stations and so on.
	 * The list contains not this field, only all fields that are connected to it.
	 * @return all block fields which are connected to this field.
	 */
	public ArrayList<BuyableField> getConnectedField() {
		return connectedFields;
	}
	
	//Methods
	//-------------------------------------------------------------------------
	
	/**
	 * Add one house on a street field. If maximal houses on the field is already reached or the field is not a 
	 * street the method throws a NotBuyableException. 
	 * @throws NotBuyableException
	 */
	public void addHouse() throws NotBuyableException{
		if (houses==maxHouses || !this.type.equals(BuyableFieldType.STREET)) {
			throw new NotBuyableException();
		}
		houses = houses+1;
	}
	
	/**
	 * Delete a house on a street field. If no house exist or this field is not a street the method throws a NotSellableException.
	 * @throws NotSellableException
	 */
	public void delHouse()throws NotSellableException {
		
		if (0==houses || !this.type.equals(BuyableFieldType.STREET)) 
			throw new NotSellableException();
		
		houses = houses-1;
	}
	/**
	 * Get the current price which has to be payed if someone (except the owner) visit this field.
	 * The price getting higher if the owner is also the owner of the block and if houses are on it.
	 * Also its 
	 * @return
	 */
	public int getCurrentVisitPrice() {
		
		
		return 1;
	}
}
