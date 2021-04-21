package org.howard.edu.lsp.exam.question40; //Implementation & Test File Package

/**
 * Interface defines methods to be implemented within the Goose and Airplane
 * Classes. Each method below is given a default String return value. 
 * @author shaneoliver
 */
public interface Flying {
	/**
	 * Initial fly() method, overrode in Goose & Airplane Classes.
	 * @return default String.
	 */
	public default String fly() {
		return ("This object can fly");
	}
}
