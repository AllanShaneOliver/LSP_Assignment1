package org.howard.edu.assignment7.junit; //JUnit test cases package

import org.howard.edu.assignment7.tollbooth.Truck;
import org.howard.edu.assignment7.tollbooth.FordTruck;
import org.howard.edu.assignment7.tollbooth.NissanTruck;
import org.howard.edu.assignment7.tollbooth.TollBooth;
import org.howard.edu.assignment7.tollbooth.AlleghenyTollBooth;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Class used to run JUnit tests on the AlleghenyTollBooth,
 * FordTruck, and NissanTruck classes. Includes main method.
 * @author shaneoliver
 */
public class TestTollBooth {
	TollBooth booth = new AlleghenyTollBooth();
	
	/**
	 * Main method, prints out "Toll Booth Test Cases:"
	 * as a title for the JUnit test cases defined below.
	 * @param args is required by the main() method, but not used.
	 */
	public static void main(String[] args) {
		System.out.println("Toll Booth Test Cases:\n");
	}
	
	/**
	 * Constructor for JUnit test cases, left blank.
	 * @throws Exception is not used.
	 */
	@BeforeEach
	void setUp() throws Exception {
		//Constructor method left blank
	}

	/**
	 * De-Constructor for JUnit test cases, states Tests executed successfully.
	 * @throws Exception is not used.
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Tests executed successfully!\n");
	}
	
	/**
	 * Creates five instances of the NissanTruck Class and tests each instance
	 * using the classes defined in the AlleghenyTollBooth class. The void 
	 * methods displayData() and reset() are tested with the integer-returning
	 * methods getTruck() and getReceipt(). 
	 */
	@Test
	@DisplayName("NissanTruck Class Test Cases")
	public void testNissanTruck() {
		Truck nissan1 = new NissanTruck(5, 12500, "Nissan 1");
		assertEquals(booth.calculateToll(nissan1), "Toll for this truck: $145");
		assertEquals(booth.getTruck(), 1);
		assertEquals(booth.getReceipt(), 145);
		assertEquals(booth.getMake(nissan1), "Nissan 1");
		assertNotEquals(booth.getMake(nissan1), "nissan 1");

		Truck nissan2 = new NissanTruck(6, 30000, "Nissan 2");
		assertEquals(booth.calculateToll(nissan2), "Toll for this truck: $330");
		assertEquals(booth.getTruck(), 2);
		assertEquals(booth.getReceipt(), 475);
		assertEquals(booth.getMake(nissan2), "Nissan 2");
		assertNotEquals(booth.getMake(nissan2), "Nissan 1");
		
		Truck nissan3 = new NissanTruck(8, 45509, "Nissan 3");
		assertEquals(booth.calculateToll(nissan3), "Toll for this truck: $490");
		assertEquals(booth.getTruck(), 3);
		assertEquals(booth.getReceipt(), 965);
		assertEquals(booth.getMake(nissan3), "Nissan 3");
		assertNotEquals(booth.getMake(nissan3), "nissan -3");
		
		Truck nissan4 = new NissanTruck(11, 548765, "Nissan 4");
		assertEquals(booth.calculateToll(nissan4), "Toll for this truck: $5535");
		assertEquals(booth.getTruck(), 4);
		assertEquals(booth.getReceipt(), 6500);
		assertEquals(booth.getMake(nissan4), "Nissan 4");
		assertNotEquals(booth.getMake(nissan4), "nissan 04");
		
		Truck nissan5 = new NissanTruck(8, 999, "Nissan 5");
		assertEquals(booth.calculateToll(nissan5), "Toll for this truck: $40");
		assertEquals(booth.getTruck(), 5);
		assertEquals(booth.getReceipt(), 6540);
		assertEquals(booth.getMake(nissan5), "Nissan 5");
		assertNotEquals(booth.getMake(nissan5), "NissaN 5");
		
		booth.displayData();
		assertEquals(booth.getTruck(), 5);
		assertEquals(booth.getReceipt(), 6540);
		booth.reset();
		assertEquals(booth.getTruck(), 0);
		assertEquals(booth.getReceipt(), 0);
		booth.displayData();
		
		Truck nissanA1 = new NissanTruck(4, 12555, "Nissan A1");
		assertEquals(booth.calculateToll(nissanA1), "Toll for this truck: $140");
		assertEquals(booth.getTruck(), 1);
		assertEquals(booth.getReceipt(), 140);
		assertEquals(booth.getMake(nissanA1), "Nissan A1");
		assertNotEquals(booth.getMake(nissanA1), "nissan A1");
		
		Truck nissanA2 = new NissanTruck(7, 000, "Nissan A2");
		assertEquals(booth.calculateToll(nissanA2), "Toll for this truck: $35");
		assertEquals(booth.getTruck(), 2);
		assertEquals(booth.getReceipt(), 175);
		assertEquals(booth.getMake(nissanA2), "Nissan A2");
		assertNotEquals(booth.getMake(nissanA2), "NIssan A2");
		
		Truck nissanA3 = new NissanTruck(0, 15035, "Nissan A3");
		assertEquals(booth.calculateToll(nissanA3), "Toll for this truck: $150");
		assertEquals(booth.getTruck(), 3);
		assertEquals(booth.getReceipt(), 325);
		assertEquals(booth.getMake(nissanA3), "Nissan A3");
		assertNotEquals(booth.getMake(nissanA3), "Nissan A03");
		
		booth.displayData();
		assertEquals(booth.getTruck(), 3);
		assertEquals(booth.getReceipt(), 325);
		booth.reset();
		assertEquals(booth.getTruck(), 0);
		assertEquals(booth.getReceipt(), 0);	
		booth.displayData();
	}
	
	/**
	 * Creates five instances of the FordTruck Class and tests each instance
	 * using the classes defined in the AlleghenyTollBooth class. The void 
	 * methods displayData() and reset() are tested using the integer-returning
	 * methods getTruck() and getReceipt(). 
	 */
	@Test
	@DisplayName("FordTruck Class Test Cases")
	public void testFordTruck() {
		Truck ford1 = new FordTruck(5, 12000, "Ford 1");
		assertEquals(booth.calculateToll(ford1), "Toll for this truck: $145");
		assertEquals(booth.getTruck(), 1);
		assertEquals(booth.getReceipt(), 145);
		assertEquals(booth.getMake(ford1), "Ford 1");
		assertNotEquals(booth.getMake(ford1), "ford 1");
		
		Truck ford2 = new FordTruck(8, 20500, "Ford 2");
		assertEquals(booth.calculateToll(ford2), "Toll for this truck: $240");
		assertEquals(booth.getTruck(), 2);
		assertEquals(booth.getReceipt(), 385);
		assertEquals(booth.getMake(ford2), "Ford 2");
		assertNotEquals(booth.getMake(ford2), "ford 2");
		
		Truck ford3 = new FordTruck(0, 1001, "Ford 3");
		assertEquals(booth.calculateToll(ford3), "Toll for this truck: $10");
		assertEquals(booth.getTruck(), 3);
		assertEquals(booth.getReceipt(), 395);
		assertEquals(booth.getMake(ford3), "Ford 3");
		assertNotEquals(booth.getMake(ford3), "ford 3");
		
		Truck ford4 = new FordTruck(0, 999, "Ford 4");
		assertEquals(booth.calculateToll(ford4), "Toll for this truck: $0");
		assertEquals(booth.getTruck(), 4);
		assertEquals(booth.getReceipt(), 395);
		assertEquals(booth.getMake(ford4), "Ford 4");
		assertNotEquals(booth.getMake(ford4), "Ford 6");
		
		Truck ford5 = new FordTruck(12, 0, "Ford 5");
		assertEquals(booth.calculateToll(ford5), "Toll for this truck: $60");
		assertEquals(booth.getTruck(), 5);
		assertEquals(booth.getReceipt(), 455);
		assertEquals(booth.getMake(ford5), "Ford 5");
		assertNotEquals(booth.getMake(ford5), "ford 0");
		
		booth.displayData();
		assertEquals(booth.getTruck(), 5);
		assertEquals(booth.getReceipt(), 455);
		booth.reset();
		assertEquals(booth.getTruck(), 0);
		assertEquals(booth.getReceipt(), 0);
		booth.displayData();
		
		Truck fordA1 = new FordTruck(4, 15889, "Ford A1");
		assertEquals(booth.calculateToll(fordA1), "Toll for this truck: $170");
		assertEquals(booth.getTruck(), 1);
		assertEquals(booth.getReceipt(), 170);
		assertEquals(booth.getMake(fordA1), "Ford A1");
		assertNotEquals(booth.getMake(fordA1), "ford A1");
		
		Truck fordA2 = new FordTruck(8, 9999, "Ford A2");
		assertEquals(booth.calculateToll(fordA2), "Toll for this truck: $130");
		assertEquals(booth.getTruck(), 2);
		assertEquals(booth.getReceipt(), 300);
		assertEquals(booth.getMake(fordA2), "Ford A2");
		assertNotEquals(booth.getMake(fordA2), "Ford a2");
		
		Truck fordA3 = new FordTruck(5, 100, "Ford A3");
		assertEquals(booth.calculateToll(fordA3), "Toll for this truck: $25");
		assertEquals(booth.getTruck(), 3);
		assertEquals(booth.getReceipt(), 325);
		assertEquals(booth.getMake(fordA3), "Ford A3");
		assertNotEquals(booth.getMake(fordA3), "Nissan A3");
		
		booth.displayData();
		assertEquals(booth.getTruck(), 3);
		assertEquals(booth.getReceipt(), 325);
		booth.reset();
		assertEquals(booth.getTruck(), 0);
		assertEquals(booth.getReceipt(), 0);
		booth.displayData();
	}
}
