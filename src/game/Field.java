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

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
