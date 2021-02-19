package org.howard.edu.lsp.assignment2.test; //implementation code package

import org.howard.edu.lsp.assignment2.combination.Combinations; //imports source code file 

/**
 * @author shaneoliver RIP
 * Program takes an array and target number, and searches for values 
 * within the array that add up to the target number
 * Class TestFile used to invoke and test the Combinations class
 */

public class TestFile {
	/**
	 * All test cases are defined and called below 
	 * @param args refers to the main method
	 */
	public static void main(String[] args) {
		//test array and target number 1
		int[] Arr1 = {5,4,1,3,2}; 
		int Target1 = 7;
		//test array and target number 2
		int[] Arr2 = {};
		int Target2 = 6;
		//test array and target number 3
		int[] Arr3 = {1,15};
		int Target3 = 12;
		//test array and target number 4
		int[] Arr4 = {5,5,15,10};
		int Target4 = 15;
		//test array and target number 5
		int[] Arr5 = {6,7,-5,4,12}; 
		int Target5 = -1; 
		
		Combinations test = new Combinations();
		
		System.out.println(test.calculateCombos(Arr1, Target1)); //calls function from implementation
		System.out.println(test.calculateCombos(Arr2, Target2));
		System.out.println(test.calculateCombos(Arr3, Target3));
		System.out.println(test.calculateCombos(Arr4, Target4));
		System.out.println(test.calculateCombos(Arr5, Target5));
		
	}
}
