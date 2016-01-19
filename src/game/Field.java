package game;
import java.util.*;

/**
 * The fields are hold in the board. A field has various arts of types.
 * 
 * @author Trickels
 *
 */
public abstract class Field {

	protected String name;
	protected List<Figure> figures = new ArrayList<Figure>();
	
	/**
	 * Set the name of the field
	 * @param name Name of the field
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get the name of the field
	 * @return name Name of the field
	 */
	public String getName() {
		return name;
	}
	
}
