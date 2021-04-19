package org.howard.edu.assignment7.tollbooth; //Implementation Classes & Interfaces package

/**
 * NissanTruck class implements protected data from the abstract class Truck. 
 * Constructor uses a setter method to obtain data passed-in during test cases. 
 * @author shaneoliver
 */
public class NissanTruck extends Truck {
	/**
	 * Class constructor uses setter method to obtain data from test cases.
	 * @param axles is defined in the Truck abstract class, obtained by setter. 
	 * @param weight is defined in the Truck abstract class, obtained by setter.
	 * @param make is defined in the Truck abstract class, obtained by setter.
	 */
	public NissanTruck(int axles, int weight, String make) {
		this.axles = axles;
		this.weight = weight;
		this.make = make;
	}
}
