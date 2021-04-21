package org.howard.edu.lsp.exam.question40; //Implementation & Test File Package

/**
 * Interface defines methods to be implemented within the Goose and Tiger 
 * Classes. Each method below is given a default String return value.
 * @author shaneoliver
 */
public interface Animal {
	/**
	 * Initial speak() method, overrode in Goose & Tiger Classes.
	 * @return default String.
	 */
	public default String speak(){
		return ("This animal speaks");
	}
	/**
	 * Initial move() method, overrode in Goose & Tiger Classes.
	 * @return default String.
	 */
	public default String move() {
		return ("This animal moves forward");
	}
}
