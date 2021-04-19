package org.howard.edu.assignment7.tollbooth; //Implementation Classes & Interfaces package

/**
 * Abstract Class Truck defines protected data which will be passed into
 * the FordTruck and NissanTruck classes - which implement this class. 
 * No methods defined in this class, aside from the default constructor.
 * @author shaneoliver
 */
public abstract class Truck {
	/**
	 * Abstract Class Constructor method left blank.
	 */
	public Truck() { 
		//Constructor method, left blank
	}
	protected int axles;
	protected int weight;
	protected String make;
}
