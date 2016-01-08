package game.Exceptions;

/**
 * Will be thrown if something is not buyable in this situation. It may
 * be caused by not enough money, when a field already owned by another player and so on.
 * 
 * @author Trickels
 *
 */

public class NotBuyableException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotBuyableException() {
		super("Can't buy item.");
	}
}
