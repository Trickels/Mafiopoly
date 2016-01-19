package Test;

import java.util.*;

public class Calculater {

	private ArrayList<Integer> results;
	
	public Calculater () {
		results = new ArrayList<Integer>();
	}
	
	public int calcPlus(int x, int y) {
		int z = x + y;
		results.add(new Integer(z));
		return z;
	}
	
	public int getLastResult() {
		return results.get(results.size()-1);
	}
}
