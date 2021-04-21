package org.howard.edu.lsp.exam.question40; //Implementation & Test File Package

/**
 * Tiger Class defines attributes related to a Tiger object.
 * Implements methods defined within the Animal Interface.
 * @author shaneoliver
 */
public class Tiger implements Animal {
	
	/**
	 * Class Constructor, prints a short description of the Tiger class. 
	 */
	public Tiger() {
		System.out.println("Tiger Class implements Animal interface");
	}
	
	/**
	 * Overrides the speak() method defined in the Animal Interface.
	 * Returns a String specific to the Tiger class.
	 */
	@Override
	public String speak() {
		return ("This Tiger speaks");
	}
	
	/**
	 * Overrides the move() method defined in the Animal Interface.
	 * Returns a String specific to the Goose class.
	 */
	@Override
	public String move() {
		return ("This Tiger moves forward");
	}
}
