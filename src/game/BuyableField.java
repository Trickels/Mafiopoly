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
	
	private int severity;
	private List<Field> connectedFields = new ArrayList<Field>();
	
	private int houses;
	private int visitUnitPrice;
	private int visitAllInPrice;
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

	public void setOwner(Player owner) {
		this.owner = owner;
	}
	public void setIndustry(Industry industry) {
		this.industry = industry;
	}
	public void setFieldPool(List<Field> connectedFields) {
		this.connectedFields = connectedFields;
	}
	
	//GETTER
	//-----------------------------------------------------------------------------------
	
	public BuyableFieldType getType() {
		return type;
	}

	public int getSeverity() {
		return severity;
	}
	
	public int getHouses() {
		return houses;
	}
	public int getVisitUnitPrice() {
		return visitUnitPrice;
	}

	public int getVisitAllInPrice() {
		return visitAllInPrice;
	}
	
	public int getBuyPrice() {
		return buyPrice;
	}

	public Player getOwner() {
		return owner;
	}
	public Industry getIndustry() {
		return industry;
	}
	public List<Field> getFieldPool() {
		return connectedFields;
	}
	
	//Methods
	//-------------------------------------------------------------------------
	public void addHouse() throws NotBuyableException{
		if (houses==maxHouses) {
			throw new NotBuyableException();
		}
		houses = houses+1;
	}
	
	public void delHouse()throws NotSellableException {
		
		if (0==houses) 
			throw new NotSellableException();
		
		houses = houses-1;
	}
}
