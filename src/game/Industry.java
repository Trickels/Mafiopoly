package game;

/**
 * The variants what industry can be build on the streets. The multiplier says how much
 * percentage of the standard price from a street is multiplied with. So if you visit
 * a cathouse 100% of the cost must be payed. A casino is more expensiv cause the owner
 * has a chance to lose the complete money. A warehouse just bring money if drugs a stored 
 * and a bank make also money with the interest of borrowed money so it should be not so expensiv
 * when you visit a bank.
 * 
 * @author Trickels
 *
 */
public enum Industry {
	CASINO(1.3),CATHOUSE(1.0),BANK(0.7),WAHREHOUSE(0.0);
	
	private Industry (double multiplier) {
	}
}
