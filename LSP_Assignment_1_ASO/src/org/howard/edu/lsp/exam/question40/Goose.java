package org.howard.edu.lsp.exam.question40; //Implementation & Test File Package

/**
 * Goose Class defines attributes related to a Goose object. 
 * Implements methods defined within the Animal & Flying Interfaces.
 * @author shaneoliver
 */
public class Goose implements Animal, Flying {
	/**
	 * Class Constructor, prints a short description of the Goose class. 
	 */
	public Goose() {
		System.out.println("Goose Class implements the Animal & Flying interfaces");
	}
	
	/**
	 * Overrides the speak() method defined in the Animal Interface.
	 * Returns a String specific to the Goose class.
	 */
	@Override
	public String speak() {
		return ("This Goose speaks");
	}
	
	/**
	 * Overrides the move() method defined in the Animal Interface.
	 * Returns a String specific to the Goose class.
	 */
	@Override
	public String move() {
		return ("This Goose moves forward");
	}
	
	/**
	 * Overrides the fly() method defined in the Animal Interface.
	 * Returns a String specific to the Goose class.
	 */
	@Override
	public String fly() {
		return ("This Goose can fly");
	}
}
