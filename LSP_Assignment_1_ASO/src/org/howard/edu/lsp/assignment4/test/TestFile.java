package org.howard.edu.lsp.assignment4.test; //implementation code package

import org.howard.edu.lsp.assignment4.implementation.IntegerSet;
import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;
/**
 * @author shaneoliver
 * Defined below are the test cases to test the IntegerSet class methods. 
 * A total of seven array lists were defined, and all methods from the 
 * IntegerSet class were performed on these array lists.
 */
public class TestFile {
	/**
	 * Main method, where all seven array lists are defined. Additionally,
	 * all methods from the IntegerSet class are called here.
	 * @param args, the default parameters for the Java main method, unused.
	 */
	public static void main(String[] args) {	
		IntegerSet list1 = new IntegerSet(); 
		IntegerSet list2 = new IntegerSet();
		IntegerSet list3 = new IntegerSet();
		IntegerSet list4 = new IntegerSet();
		IntegerSet list5 = new IntegerSet();
		IntegerSet list6 = new IntegerSet();
		IntegerSet list7 = new IntegerSet();
		
		//List list1 initial values 
		list1.add(1);
		list1.add(2); 
		list1.add(3); 
		list1.add(4);
		list1.add(5);
		//List list2 initial values
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(7);		
		//List list3 initial values
		list3.add(1);
		list3.add(2);
		list3.add(4);
		list3.add(6);
		list3.add(8);
		list3.add(10);
		list3.add(12);
		list3.add(14);
		list3.add(15);
		//List List4 initial values
		list4.add(-1);
		list4.add(6);
		list4.add(0);
		list4.add(5);
		list4.add(-5);
		list4.add(12);
		
		//Test cases for lists 1 - 4
		System.out.println("\nList1 Method Tests: \n");
		System.out.println("length: " + list1.length());
		System.out.println("contains: " + list1.contains(3));
		list1.add(5);
		System.out.println("after 5 added: " + list1);
		list1.add(1); 
		System.out.println("after 1 added: " + list1);
		list1.add(6); 
		System.out.println("after 6 added: " + list1);
		list1.remove(3); 
		System.out.println("after 3 removed" + list1);
		System.out.println("empty: " + list1.isEmpty());
		System.out.println("String: " + list1.toString());
		try {
			list1.largest();
			System.out.println("largest value: " + list1.largest());
		}
		catch (IntegerSetException ExceptionMsg) {
			System.out.println(ExceptionMsg);
		}
		try {
			list1.smallest();
			System.out.println("smallest value: " + list1.smallest());
		}
		catch (IntegerSetException ExceptionMsg) {
			System.out.println(ExceptionMsg);
		}
		list1.clear();
		
		System.out.println("\nList2 Method Tests: \n");
		System.out.println("length: " + list2.length());
		System.out.println("contains: " + list2.contains(1));
		list2.add(8); 
		System.out.println("after 8 added: " + list2);
		list2.add(-2); 
		System.out.println("after -2 added: " + list2);
		list2.add(4); 
		System.out.println("after 4 added: " + list2);
		list2.remove(1);
		System.out.println("after 1 removed: " + list2);
		System.out.println("empty: " + list2.isEmpty());
		System.out.println("String: " + list2.toString());
		try {
			list2.largest();
			System.out.println("largest value: " + list2.largest());
		}
		catch (IntegerSetException ExceptionMsg) {
			System.out.println(ExceptionMsg);
		}
		try {
			list2.smallest();
			System.out.println("smallest value: " + list2.smallest());
		}
		catch (IntegerSetException ExceptionMsg) {
			System.out.println(ExceptionMsg);
		}
		list2.clear();
		try {
			list2.largest();
			System.out.println("largest value: " + list2.largest());
		}
		catch (IntegerSetException ExceptionMsg) {
			System.out.println(ExceptionMsg);
		}
		try {
			list2.smallest();
			System.out.println("smallest value: " + list2.smallest());
		}
		catch (IntegerSetException ExceptionMsg) {
			System.out.println(ExceptionMsg);
		}
		
		System.out.println("\nList3 Method Tests: \n");
		System.out.println("length: " + list3.length());
		System.out.println("contains: " + list3.contains(7));
		list3.add(2); 
		System.out.println("after 2 added: " + list3);
		list3.add(-4); 
		System.out.println("after -4 added: " + list3);
		list3.add(18); 
		System.out.println("after 18 added: " + list3);
		list3.remove(7);
		System.out.println("after 7 removed: " + list3);
		System.out.println("empty: " + list3.isEmpty());
		System.out.println("String: " + list3.toString());
		try {
			list3.largest();
			System.out.println("largest value: " + list3.largest());
		}
		catch (IntegerSetException ExceptionMsg) {
			System.out.println(ExceptionMsg);
		}
		try {
			list3.smallest();
			System.out.println("smallest value: " + list3.smallest());
		}
		catch (IntegerSetException ExceptionMsg) {
			System.out.println(ExceptionMsg);
		}
		list3.clear();
		
		System.out.println("\nList4 Method Tests: \n");
		System.out.println("length: " + list4.length());
		System.out.println("contains: " + list4.contains(-1));
		list4.add(-6); 
		System.out.println("after -6 added: " + list4);
		list4.add(4); 
		System.out.println("after 4 added: " + list4);
		list4.add(3); 
		System.out.println("after 3 added: " + list4);
		list4.remove(-1);
		System.out.println("after -1 removed: " + list4);
		System.out.println("empty: " + list4.isEmpty());
		System.out.println("String: " + list4.toString());
		try {
			list4.largest();
			System.out.println("largest value: " + list4.largest());
		}
		catch (IntegerSetException ExceptionMsg) {
			System.out.println(ExceptionMsg);
		}
		try {
			list4.smallest();
			System.out.println("smallest value: " + list4.smallest());
		}
		catch (IntegerSetException ExceptionMsg) {
			System.out.println(ExceptionMsg);
		}
		list4.clear();
		
		//List list5 initial values
		list5.add(2);
		list5.add(4);
		list5.add(6);
		list5.add(8);
		list5.add(10);
		list5.add(12);
		//List list6 initial values
		list6.add(2);
		list6.add(4);
		list6.add(6);
		list6.add(8);
		list6.add(10);	
		list6.add(12);
		//List list7 initial values
		list7.add(4);
		list7.add(8);
		list7.add(12);
		list7.add(-16);
		list7.add(-20);
		list7.add(0);
		
		//Test cases for lists 5 - 7 
		System.out.println("\nLists 5-7 method tests:\n");
		System.out.println("equals:" + list5.equals(list6));
		System.out.println("equals:" + list6.equals(list7));
		System.out.println("equals:" + list7.equals(list5));
		list5.diff(list6);
		System.out.println("Difference: " + list5);
		list6.diff(list7);
		System.out.println("Difference: " + list6);
		list7.union(list6);
		System.out.println("Union: " + list7);
		list6.union(list5);
		System.out.println("Union: " + list6);
		list7.intersect(list6);
		System.out.println("Intersection: " + list7);
		list6.intersect(list5);
		System.out.println("Intersection: " + list6);
		list7.clear();
	}
}
