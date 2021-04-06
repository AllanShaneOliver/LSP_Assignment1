package org.howard.edu.lsp.assignment6.junit; //Package defines JUnit test file.

import org.howard.edu.lsp.assignment6.integerset.IntegerSet; 
import org.howard.edu.lsp.assignment6.integerset.IntegerSetException; 

import static org.junit.Assert.*; 
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

/**
 * @author shaneoliver
 * Class of JUnit test cases to test my IntegerSet class and implementation file.
 * Tests all methods written in my IntegerSet class by observing how each method
 * alters the contents of three given (defined below) IntegerSet class ArrayLists.
 */
public class IntegerSetTest {
	IntegerSet set1 = new IntegerSet(); 
	IntegerSet set2 = new IntegerSet();
	IntegerSet set3 = new IntegerSet();

	/**
	 * Main method, used to print the purpose of the IntegerSet class.
	 * @param args is standard for all main methods. 
	 */
	public static void main(String[] args) {
		System.out.println("IntegerSet Class Test File using JUnit testing\n");
	}
	
	/**
	 * Constructor for the IntegerSetTest class.
	 * Initializes all values placed in IntegerSets Set1, Set2, and Set3.
	 * @throws Exception is not used.
	 */
	@Before
	public void setUp() throws Exception {
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set3.add(-4);
		set3.add(-2);
		set3.add(0);
		set3.add(2);
		set3.add(4);
		set3.add(6);
		set3.add(8);
	}
	
	/**
	 * De-constructor for the IntegerSetTest class. 
	 * Used once all JUnit tests finish execution.
	 * @throws Exception is not used.
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("Tests executed successfully!");
	}

	/**
	 * Since clear() is a void method, the ArrayList itself is cleared,
	 * and the length() method is called to compare the cleared ArrayList
	 * to zero, to ensure the clear() method works as intended.
	 */
	@Test
	@DisplayName("\nTest cases for Clear method: ")
	public void testClear() {
		System.out.println("\nTest cases for Clear method: ");
		set1.clear();
		assertEquals(set1.length(), 0);
		System.out.println("The length of a cleared ArrayList is zero. Therefore, the clear() method works!");
		set2.clear();
		assertEquals(set2.length(), 0);
		System.out.println("The length of a cleared ArrayList is zero. Therefore, the clear() method works!");
	}
	
	/**
	 * Uses assertEquals to test the length() method, 
	 * which determines the number of integers in a given ArrayList.
	 */
	@Test 
	@DisplayName("\nTest cases for Length method: ")
	public void testLength() {
		System.out.println("\nTest cases for Length method: ");
		assertEquals(set1.length(), 5);
		set2.clear();
		assertEquals(set2.length(), 0);
		System.out.println("Since Set2 has been cleared, it has no length.");
		set1.remove(1);
		assertEquals(set1.length(), 4);
		System.out.println("Since an element was removed from Set1, its length was reduced from 5 to 4");
		set3.add(3);
		assertEquals(set3.length(), 8);
		System.out.println("Since an element was added to Set3, its length was increased from 7 to 8.");
	}
	
	/**
	 * Uses assertTrue and assertFalse to determine whether two
     * ArrayLists contain the exact same elements in any order.
	 */
	@Test
	@DisplayName("\nTest cases for Equals method: ")
	public void testEquals () {
		System.out.println("\nTest cases for Equals method: ");
		assertTrue(set1.equals(set2));
		assertFalse(set1.equals(set3));
		System.out.println("Set1 and Set3 do not contain the same integers or have the same length. Two sets are unequal.");
		set1.add(6);
		set2.add(6);
		assertTrue(set1.equals(set2));
		set1.add(0);
		set2.add(-1);
		assertFalse(set1.equals(set2));
		System.out.println("Set1 contains the integer 0 and Set2 contains the integer -1. Two sets are unequal.");
		set1.clear();
		System.out.println("Set1 has been cleared whereas Set2 still contains values. Two sets are unequal.");
		assertFalse(set2.equals(set3));
		System.out.println("Set2 and Set3 do not contain the same integers or have the same length. Two sets are unequal.");
		set3.clear();
		assertTrue(set1.equals(set3));
	}
	
	/**
	 * Uses assertTrue and assertFalse to determine if 
	 * a given integer is present within an ArrayList.
	 */
	@Test
	@DisplayName("\nTest cases for Contains method: ")
	public void testContains() {
		System.out.println("\nTest cases for Contains method: ");
		assertTrue(set1.contains(4));
		assertTrue(set1.contains(2));
		assertTrue(set2.contains(5));
		assertFalse(set2.contains(7));
		System.out.println("Set2 contains the integers 1 to 5, which excludes 7.");
		set1.clear();
		assertFalse(set1.contains(0));
		System.out.println("Set1 was cleared, so it cannot contain the integer 0.");
		assertFalse(set2.contains(-4));
		System.out.println("Set2 contains the integers 1 to 5, which exculdes -4.");
		set2.add(-4);
		set2.add(-1);
		set2.add(0);
		assertTrue(set2.contains(-4));
		assertTrue(set2.contains(0));
		assertTrue(set3.contains(-4));
		assertFalse(set3.contains(12));
		System.out.println("Set3 contains integers -4 to 8, which excludes 12.");
		assertTrue(set3.contains(0));
	}
	
	/**
	 * Uses assertEquals and a try/catch block to determine
	 * the largest integer present within an ArrayList.
	 */
	@Test
	@DisplayName("\nTest cases for Largest method: ")
	public void testLargest() {
		System.out.println("\nTest cases for Largest method: ");
		try {
			assertEquals(set1.largest(), 5);
			System.out.println("largest value: " + set1.largest());
		}
		catch (IntegerSetException ExceptionMsg) {
			System.out.println(ExceptionMsg);
		}
		set1.clear();
		try {
			assertEquals(set1.largest(), 5);
			System.out.println("largest value: " + set1.largest());
		}
		catch (IntegerSetException ExceptionMsg) {
			System.out.println(ExceptionMsg);
		}
		try {
			assertEquals(set2.largest(), 5);
			System.out.println("largest value: " + set2.largest());
		}
		catch (IntegerSetException ExceptionMsg) {
			System.out.println(ExceptionMsg);
		}
		set2.clear();
		set2.add(-4);
		try {
			assertEquals(set2.largest(), -4);
			System.out.println("largest value: " + set2.largest());
		}
		catch (IntegerSetException ExceptionMsg) {
			System.out.println(ExceptionMsg);
		}
		try {
			assertEquals(set3.largest(), 8);
			System.out.println("largest value: " + set3.largest());
		}
		catch (IntegerSetException ExceptionMsg) {
			System.out.println(ExceptionMsg);
		}
		set3.clear();
		try {
			assertEquals(set3.largest(), 8);
			System.out.println("largest value: " + set3.largest());
		}
		catch (IntegerSetException ExceptionMsg) {
			System.out.println(ExceptionMsg);
		}
	}
	
	/**
	 * Uses assertEquals and a try/catch block to determine
	 * the smallest integer present within an ArrayList.
	 */
	@Test
	@DisplayName("\nTest cases for Smallest method: ")
	public void testSmallest() {
		System.out.println("\nTest cases for Smallest method: ");
		try {
			assertEquals(set1.smallest(), 1);
			System.out.println("smallest value: " + set1.smallest());
		}
		catch (IntegerSetException ExceptionMsg) {
			System.out.println(ExceptionMsg);
		}
		set1.clear();
		try {
			assertEquals(set1.smallest(), 1);
			System.out.println("smallest value: " + set1.smallest());
		}
		catch (IntegerSetException ExceptionMsg) {
			System.out.println(ExceptionMsg);
		}
		try {
			assertEquals(set2.smallest(), 1);
			System.out.println("smallest value: " + set2.smallest());
		}
		catch (IntegerSetException ExceptionMsg) {
			System.out.println(ExceptionMsg);
		}
		set2.clear();
		set2.add(44);
		try {
			assertEquals(set2.smallest(), 44);
			System.out.println("smallest value: " + set2.smallest());
		}
		catch (IntegerSetException ExceptionMsg) {
			System.out.println(ExceptionMsg);
		}
		try {
			assertEquals(set3.smallest(), -4);
			System.out.println("smallest value: " + set3.smallest());
		}
		catch (IntegerSetException ExceptionMsg) {
			System.out.println(ExceptionMsg);
		}
		set3.clear();
		try {
			assertEquals(set1.smallest(), 1);
			System.out.println("smallest value: " + set3.smallest());
		}
		catch (IntegerSetException ExceptionMsg) {
			System.out.println(ExceptionMsg);
		}	
	}
	
	/**
	 * Uses assertTrue or assertFalse to determine whether or not
	 * a given integer is present within an ArrayList. If not present,
	 * uses assertEquals to determine if the given integer has been 
	 * added to the ArrayList.
	 */
	@Test
	@DisplayName("\nTest cases for Add method: ")
	public void testAdd() {
		System.out.println("\nTest cases for Add method: ");
		assertTrue(set1.contains(5));
		set1.add(5);
		assertEquals(set1.toString(), "[1, 2, 3, 4, 5]");
		System.out.println("Set1 already contained the integer 5, so another 5 was NOT added.");
		assertFalse(set2.contains(0));
		assertFalse(set2.contains(-100));
		set2.add(0);
		set2.add(-100);
		assertEquals(set2.toString(), "[1, 2, 3, 4, 5, 0, -100]");
		System.out.println("Set2 did not initially contain the integers 0 and -100. Therefore, 0 and -100 were added.");
		set3.add(-4);
		assertTrue(set3.contains(-4));
		System.out.println("Set3 already contains the integer -4, so another -4 was NOT added.");
		assertFalse(set3.contains(-7));
		set3.add(-7); 
		assertTrue(set3.contains(-7));
		assertEquals(set3.toString(), "[-4, -2, 0, 2, 4, 6, 8, -7]");
		System.out.println("Set3 did not initially contain the integer -7, so -7 was added.");	
	}
	
	/**
	 * Uses assertTrue or assertFalse to determine whether or not
	 * a given integer is present within an ArrayList. If present,
	 * uses assertEquals to determine if the given integer has been 
	 * removed from the ArrayList.
	 */
	@Test
	@DisplayName("\nTest cases for Remove method: ")
	public void testRemove() {
		System.out.println("\nTest cases for Remove method: ");
		set1.remove(-10);
		assertFalse(set1.contains(-10));
		assertEquals(set1.toString(), "[1, 2, 3, 4, 5]");
		System.out.println("Set1 does not contain the integer -10, so -10 cannot be removed.");
		set1.add(-10);
		assertTrue(set1.contains(-10));
		set1.remove(-10);
		assertEquals(set1.toString(), "[1, 2, 3, 4, 5]");
		System.out.println("Now that the integer -10 was added to Set1, it can be removed from Set1.");
		assertTrue(set2.contains(3));
		set2.remove(3);
		assertEquals(set2.toString(), "[1, 2, 4, 5]");
		System.out.println("Set2 already contained the integer 3, so 3 was removed.");
		set3.remove(0);
		assertFalse(set3.contains(0));
		assertEquals(set3.toString(), "[-4, -2, 2, 4, 6, 8]");
		System.out.println("Set3 does not contain the integer 0, so 0 cannot be removed.");
		assertTrue(set3.contains(8));
		set3.remove(8);
		assertEquals(set3.toString(), "[-4, -2, 2, 4, 6]");
		System.out.println("Set3 already contained the integer 8, so 8 was removed.");
	}
	
	/**
	 * Uses assertEquals to determine whether the calculated union 
	 * of two sets was performed properly by the Union() method.
	 */
	@Test
	@DisplayName("\nTest cases for Union method: ")
	public void testUnion() {
		System.out.println("\nTest cases for Union method: ");
		set1.union(set2);
		assertEquals(set1.toString(), "[1, 2, 3, 4, 5]");
		System.out.println("Set1 and Set2 were combined without adding any duplicates.");
		set1.add(6);
		set2.add(-12);
		set2.union(set1);
		assertEquals(set2.toString(), "[1, 2, 3, 4, 5, -12, 6]");
		System.out.println("Set1 and Set2 were combined without adding any duplicates and including 6 and -12.");
		set3.union(set1);
		assertEquals(set3.toString(), "[-4, -2, 0, 2, 4, 6, 8, 1, 3, 5]");
		System.out.println("Elements of Set1 were added to Set3 without adding any duplicates.");
		set2.add(-44);
		set3.union(set2);
		assertEquals(set3.toString(), "[-4, -2, 0, 2, 4, 6, 8, 1, 3, 5, -12, -44]");
		System.out.println("Elements of Set2 were added to Set2 without adding any duplicates and including -44.");
		set3.clear();
		set1.union(set3);
		assertEquals(set1.toString(), "[1, 2, 3, 4, 5, 6]");
		System.out.println("Difference calculated between Set1 and Set3 with Set3 cleared.");
	}
	
	/**
	 * Uses assertEquals to determine whether the calculated intersection 
	 * of two sets was performed properly by the Intersect() method.
	 */
	@Test
	@DisplayName("\nTest cases for Intersect method: ")
	public void testIntersect() {
		System.out.println("\nTest cases for Intersect method: ");
		set1.intersect(set2);
		assertEquals(set1.toString(), "[1, 2, 3, 4, 5]");
		System.out.println("Set1 and Set2 intersection calculated without any additional integers added or removed.");
		set1.add(14);
		set1.add(-9);
		set2.add(-9);
		set2.remove(4);
		set2.intersect(set1);
		assertEquals(set2.toString(), "[1, 2, 3, 5, -9]");
		System.out.println("Intersection of Set1 and Set2 calculated with -9 added to both sets and 3 removed from Set2.");
		set1.intersect(set3);
		System.out.println("Set1 and Set3 intersection calculated without any additional integers added or removed.");
		assertEquals(set1.toString(), "[2, 4]");
		set3.add(0);
		set2.add(0);
		set2.add(-5);
		set3.intersect(set2);
		assertEquals(set3.toString(), "[0, 2]");
		System.out.println("Set3 and Set2 intersection calculated with 0 added to both sets and -5 added to Set2.");
		set2.clear();
		set3.intersect(set2);
		assertEquals(set3.toString(), "[0, 2]");
		System.out.println("Intersection calculated between Set2 and Set3 with Set2 cleared.");
	}
	
	/**
	 * Uses assertEquals to determine whether the calculated difference 
	 * between two sets was performed properly by the Diff() method.
	 */
	@Test
	@DisplayName("\nTest cases for Difference method: ")
	public void testDiff() {
		System.out.println("\nTest cases for Difference method: ");
		set1.diff(set2);
		assertEquals(set1.toString(), "[]");
		System.out.println("Set1 and Set2 have the same exact elements, so there is no difference between the two.");
		set1.add(12);
		set2.add(-12);
		set2.add(-7);
		set2.diff(set1);
		assertEquals(set2.toString(), "[1, 2, 3, 4, 5, -12, -7]");
		System.out.println("Difference calculated between Set1 and Set2 with 12 added to Set1 and -7 and -12 added to Set2");
		set1.remove(12);
		set3.add(14);
		set1.diff(set1);
		System.out.println(set1);
		assertEquals(set1.toString(), "[]");
		System.out.println("Difference calculated between Set1 and Set3 with 12 removed from Set1 and 14 added to Set3.");
		set3.diff(set2);
		assertEquals(set3.toString(), "[-4, -2, 0, 6, 8, 14]");
		System.out.println("Difference calculated between Set3 and Set 2 with no integers added or removed.");
		set2.clear();
		set3.diff(set2);
		assertEquals(set3.toString(), "[-4, -2, 0, 6, 8, 14]");
		System.out.println("Difference calculated between Set2 and Set3 with Set2 cleared.");
	}
	
	/**
	 * Uses assertTrue and assertFalse to test whether or not
	 * a given ArrayList contains no elements, or was properly
	 * cleared by the Clear() method. 
	 */
	@Test
	@DisplayName("\nTest cases for IsEmpty method: ")
	public void testIsEmpty() {
		System.out.println("\nTest cases for IsEmpty method: ");
		assertFalse(set1.isEmpty());
		System.out.println("Set1 has not been cleared so therefore is not empty.");
		set1.clear();
		assertTrue(set1.isEmpty());
		assertFalse(set2.isEmpty());
		System.out.println("Set2 has not been cleared so therefore is not empty.");
		set2.clear();
		assertTrue(set2.isEmpty());
		set3.clear();
		set3.add(0);
		System.out.println("Integers in Set3: " + set3);
		assertFalse(set3.isEmpty());
		System.out.println("Set3 was cleared then the integer 0 was added to it. Therefore, Set3 is not empty.");
	}
	
	/**
	 * Uses assertEquals to test if the toString() method converted
	 * a given ArrayList into its proper String representation.
	 */
	@Test
	@DisplayName("\nTest cases for ToString method: ")
	public void testToString() {
		System.out.println("\nTest cases for ToString method: ");
		assertEquals(set1.toString(), "[1, 2, 3, 4, 5]");
		assertEquals(set2.toString(), "[1, 2, 3, 4, 5]");
		assertEquals(set3.toString(), "[-4, -2, 0, 2, 4, 6, 8]");
		set3.clear();
		set3.add(0);
		set3.add(-1);
		assertEquals(set3.toString(), "[0, -1]");
		System.out.println("Set3 was cleared then the integers 0 and -1 were added to it. Now the set reads: [0, -1].");
	}
}
