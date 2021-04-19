package org.howard.edu.assignment7.tollbooth; //Implementation Classes & Interfaces package

/**
 * Interface defines methods used within the AlleghenyTollBooth class.
 * This includes a method used to calculate the toll for a given truck,
 * a method to print receipts, and a method to clear all recent data.
 * Getter methods are defined to obtain private integer values defined
 * within the AlleghenyTollBooth class: which implements this interface. 
 * @author shaneoliver
 */
public interface TollBooth {
	public String calculateToll(Truck model);
	public void displayData();
	public void reset();
	public int getTruck();
	public int getReceipt();
	public String getMake(Truck model);
}
