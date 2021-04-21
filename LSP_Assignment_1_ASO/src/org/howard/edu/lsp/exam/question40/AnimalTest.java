package org.howard.edu.lsp.exam.question40; //Implementation & Test File Package

import org.howard.edu.lsp.exam.question40.Animal;
import org.howard.edu.lsp.exam.question40.Flying;
import org.howard.edu.lsp.exam.question40.Airplane;
import org.howard.edu.lsp.exam.question40.Goose;
import org.howard.edu.lsp.exam.question40.Tiger;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * AnimalTest class defines JUnit test case methods used to test
 * the implementation of the Goose, Tiger, and Airplane classes. 
 * @author shaneoliver
 */
class AnimalTest {
	/**
	 * Main method, prints a title explaining the purpose of each 
	 * JUnit test case, and methods used to execute the test cases.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("JUnit test for Animal & Flying Interfaces, along with their subclasses");
	}
	
	/**
	 * Constructor method for JUnit test cases, not used.
	 * @throws Exception is not used.
	 */
	@BeforeEach
	void setUp() throws Exception {
		//Constructor not used: prints or returns nothing.
	}

	/**
	 * De-Constructor method for JUnit test cases, prints
	 * "Tests executed successfully" when test cases finish execution.
	 * @throws Exception is not used.
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Tests executed successfully");
	}
	
	/**
	 * Method to test the Goose class, along with all methods defined
	 * inside the Goose class. Implements both Flying & Animal interfaces.
	 */
	@Test
	@DisplayName("Goose Class method tests")
	public void testGoose() {
		Animal goose = new Goose();
		Flying gooseB = new Goose();
		assertEquals(goose.speak(), "This Goose speaks");
		assertNotEquals(goose.speak(), "This Goose moves forward");
		assertNotEquals(goose.speak(), "This animal speaks");
		assertEquals(goose.move(), "This Goose moves forward");
		assertNotEquals(goose.move(), "This Goose speaks");
		assertNotEquals(goose.move(), "This animal moves forward");
		assertEquals(gooseB.fly(), "This Goose can fly");
		assertNotEquals(gooseB.fly(), "This object can fly");
		assertNotEquals(gooseB.fly(), "This animal can fly");
	}
	
	/**
	 * Method to test the Tiger class, along with all methods defined
	 * inside the Tiger class. Implements the Animal interface.
	 */
	@Test
	@DisplayName("Tiger Class method tests")
	public void testTiger(){
		Animal tiger = new Tiger();
		assertEquals(tiger.speak(), "This Tiger speaks");
		assertNotEquals(tiger.speak(), "This Tiger moves forward");
		assertNotEquals(tiger.speak(), "This animal speaks");
		assertEquals(tiger.move(), "This Tiger moves forward");
		assertNotEquals(tiger.move(), "This Tiger speaks");
		assertNotEquals(tiger.speak(), "This animal moves forward");
	}
	
	/**
	 * Method to test the Airplane class, along with all methods defined
	 * inside the Airplane class. Implements the Flying interface.
	 */
	@Test
	@DisplayName("Airplane Class method tests")
	public void testAirplane() {
		Airplane airplane = new Airplane();
		assertEquals(airplane.fly(), "This Airplane can fly");
		assertNotEquals(airplane.fly(), "This object can fly");
		assertNotEquals(airplane.fly(), "This animal can fly");
	}
}
