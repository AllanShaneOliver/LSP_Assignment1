package org.howard.edu.lsp.exam.question41; //Implementation & Test Cases Package

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Filter class defines methods to alter the contents within an ArrayList.
 * An ArrayList is declared, so any object of class Filter is an ArrayList.
 * @author shaneoliver
 */
public class Filter {
	
	private ArrayList<Integer> list = new ArrayList<Integer>();
	
	/**
	 * Method to add values into the ArrayList, used by JUnit test cases.
	 * @param value, is passed-in by the user when this method is called.
	 */
	public void add(int value) {
		list.add(value);
	}
	
	/**
	 * Method to convert the ArrayList to a String. Used by JUnit test cases, 
	 * to output the entire ArrayList and display how it has been altered. 
	 */
	public String toString() {
		return(list.toString());
	}
	
	/**
	 * Method used to remove all zeros (0) from the ArrayList. Calls
	 * the built-in contains() method to loop-through the ArrayList.
	 */
	public void removeZeros(){
		if (list.contains(0)) {
			list.removeAll(Arrays.asList(0));
		}
	}
}
