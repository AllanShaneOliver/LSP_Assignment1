package org.howard.edu.lsp.exam.question41; //Implementation & Test Cases Package

import org.howard.edu.lsp.exam.question41.Filter;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Class defines methods and objects to test the capabilities of the
 * Filter class. Specifically, the removeZeros() method is tested below.
 * @author shaneoliver
 */
class FilterTest {
	Filter list1 = new Filter();
	Filter list2 = new Filter();
	Filter list3 = new Filter();
	Filter list4 = new Filter();
	
	/**
	 * Main method, prints a title stating "JUnit test cases 
	 * for Filter Class methods:" to the output Console. 
	 */
	public static void main(String[] args) {
		System.out.println("JUnit test cases for Filter Class methods:");
	}
	
	/**
	 * Constructor initializes values for ArrayList objects defined above. 
	 * @throws Exception, is not Used.
	 */
	@BeforeEach
	void setUp() throws Exception {
		list1.add(0);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list2.add(2);
		list2.add(4);
		list2.add(6);
		list2.add(8);
		list3.add(0);
		list3.add(7);
		list3.add(2);
		list3.add(0);
		list3.add(0);
		list4.add(0);
		list4.add(0);
		list4.add(0);
		list4.add(0);
		list4.add(0);
	}
	
	/**
	 * De-constructor prints "Tests Executed Successfully"
	 * after each JUnit method completes execution.
	 * @throws Exception, is not used.
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Tests Executed Successfully");
	}
	
	/**
	 * Tests the capabilities of the removeZeros() method on
	 * the ArrayList objects declared and initialized above.
	 */
	@Test
	@DisplayName ("removeZeros method test cases")
	public void testRemoveZeros() {
		//Test cases for list1
		list1.add(0);
		list1.removeZeros();
		assertEquals(list1.toString(), "[1, 2, 3, 4, 5]");
		assertNotEquals(list1.toString(), "[0, 1, 2, 3, 4, 5, 0]");
		//Test cases for list2
		list2.add(-5);
		list2.add(10);
		list2.removeZeros();
		assertEquals(list2.toString(), "[2, 4, 6, 8, -5, 10]");
		assertNotEquals(list2.toString(), "[0, 2, 4, 6, 8, -5, 10]");
		//Test cases for list3
		list3.add(4);
		list3.add(0);
		list3.removeZeros();
		assertEquals(list3.toString(), "[7, 2, 4]");
		assertNotEquals(list3.toString(), "[0, 7, 2, 0, 0, 4, 0]");
		//Test cases for list4
		list4.add(0);
		list4.add(0);
		list4.removeZeros();
		assertEquals(list4.toString(), "[]");
		assertNotEquals(list4.toString(), "[0, 0, 0, 0, 0, 0, 0]");
	}
}
