package org.howard.edu.assignment7.tollbooth; //Implementation Classes & Interfaces package

import org.howard.edu.assignment7.tollbooth.FordTruck;
import org.howard.edu.assignment7.tollbooth.NissanTruck;

/**
 * Class implements the TollBooth interface and utilizes data obtained
 * by the FordTruck and NissanTruck classes. Toll calculations are 
 * completed here, along with displaying and resetting recent receipts. 
 * @author shaneoliver
 */
public class AlleghenyTollBooth implements TollBooth {
	private int totaltrucks = 0;
	private int totalreceipts = 0;
	
	/**
	 * Constructor method: provides a simple print statement to the console
	 * as a "title" for the data displayed by methods defined below.
	 */
	public AlleghenyTollBooth() {
		System.out.println("Data for the Allegheny Toll Booth\nInterstate 76 - Pennsylvania Turnpike\n");
	}
	
	/**
	 * Method displays the total receipts collected and total number of trucks
	 * which passed through the Toll Booth by printing the values of both the
	 * receipt and truck counters. 
	 */
	public void displayData() {
		System.out.println("\n *** Collecting Receipts ***");
		System.out.println("Totals since the last collection - Receipts: $" + totalreceipts + 
				" Trucks: " + totaltrucks + "\n"); 
	}
	
	/**
	 * Calls the displayData() method to print current receipts, 
	 * then resets the truck and receipt counters to zero. 
	 */
	public void reset() {
		displayData();
		totaltrucks = 0;
		totalreceipts = 0;
	}
	
	/**
	 * Uses the number of axles and weight of a given truck in US Pounds
	 * to calculate the total amount due in toll(s) for the truck.
	 * The truck and receipt counters are incremented each time a truck
	 * passes through the Toll Booth and a toll is charged.
	 */
	@Override
	public String calculateToll(Truck model) {
		int localaxles = model.axles; 
		int localweight = model.weight;
		String localmake = model.make;
		//Convert US Pounds to US Tons
		int axlecost = localaxles * 5;
		int weightcost = Math.floorDiv(localweight, 1000) * 10;
		int totalcost = axlecost + weightcost;
		totaltrucks++;
		totalreceipts = totalcost + totalreceipts;
		System.out.println("Truck make: " + localmake);
		System.out.println("Number of axles: " + localaxles + ", Weight in US Pounds: " + localweight);
		System.out.println("Toll for this truck: $" + totalcost);
		return("Toll for this truck: $" + totalcost);
	}
	
	/**
	 * Getter method to obtain the value of the truck counter.
	 * Returns the truck counter value as an integer.
	 * Used to JUnit test the displayData() and reset() methods.
	 */
	public int getTruck() {
		return totaltrucks;
	}
	
	/**
	 * Getter method to obtain the value of the receipt counter.
	 * Returns the receipt counter value as an integer.
	 * Used to JUnit test the displayData() and reset() methods.
	 */
	public int getReceipt() {
		return totalreceipts;
	}
	
	/**
	 * Getter method to obtain the make of a given truck.
	 * Returns the make of a given truck, as a String. 
	 */
	public String getMake(Truck model) {
		return model.make;
	}
}
