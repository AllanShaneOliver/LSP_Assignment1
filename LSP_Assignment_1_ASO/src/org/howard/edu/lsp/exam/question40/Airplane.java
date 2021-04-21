package org.howard.edu.lsp.exam.question40; //Implementation & Test File Package

/**
 * Airplane class defines attributes related to an Airplane object.
 * Implements methods defined within the Flying interface.
 * @author shaneoliver
 */
public class Airplane implements Flying {

	/**
	 * Class Constructor, prints a short description of the Goose class. 
	 */
	public Airplane() {
		System.out.println("Airplane Class implements Flying interface");
	}
	
	/**
	 * Overrides the fly() method defined in the Animal Interface.
	 * Returns a String specific to the Goose class.
	 */
	@Override
	public String fly() {
		return ("This Airplane can fly");
	}
}
