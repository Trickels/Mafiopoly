package game.Exceptions;

/**
 * Will be thrown if something is not sellable in this situation.
 * 
 * @author Trickels
 *
 */

public class NotSellableException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotSellableException() {
		super("Can't sell item");
	}
}
