package org.howard.edu.lsp.assignment2.combination; //source code package

import java.util.Arrays;      
import java.util.ArrayList;
/**
 * Source code file, includes a class to calculate combinations 
 * of numbers which add up to the target number
 * @author shaneoliver RIP    
 */
public class Combinations {
	/**
	 * @param UserArr refers to the array passed into the function, 
	 * which will be searched for values which add up to the target number
	 * @param TargetNum refers to the Target Number which array values must add up to
	 * @return output refers to the ArrayList containing all the Array values which add 
	 * up to the target number
	 */
	
	public ArrayList<String> calculateCombos(int[] UserArr, int TargetNum) {
		String index; //each index prior to adding to the final output ArrayList  
		ArrayList<String> output = new ArrayList<String>(); //ArrayList object will be the final output: 
		//An ArrayList of strings is required for formatting purposes, and to add each index value to
		//the ArrayList, without adding those index values together
		
		if (UserArr.length == 0) { //print an output of zero if the array has no length
			output.add("0");
		}
		//first for loop, adds index of any array value to output ArrayList, if it matches target number  	
		for (int i=0; i<UserArr.length; i++ ){
			int currentIndex = UserArr[i]; //current array value which i is pointing to
			index = Integer.toString(i); 
			if (currentIndex == TargetNum) {
				output.add(index); 
			}
			//second (nested) for loop, starts at the array value to the right of i
			for (int j=i+1; j<UserArr.length; j++) {				
				currentIndex +=UserArr[j];	
				//increment j if the Current Index is less than the Target Number
				if (currentIndex < TargetNum) {
					index += Integer.toString(j);
				}
				//add value of j to ArrayList output if Current Index equals the Target Number
				else if (currentIndex == TargetNum) {
					index += ",";
					index += Integer.toString(j); 
					output.add(index);
				}
				//increment j if the Current Index is greater than the Target Number
				else if (currentIndex > TargetNum) {
					currentIndex = UserArr[i] + UserArr[j]; //redefine the Current Index as both i + j
					index = Integer.toString(i);
					//add value of j to ArrayList output if Current Index equals the Target Number
					if (currentIndex < TargetNum) {
						index += ", ";
						index += Integer.toString(j); 						
					}
					//add value of j to ArrayList output if Current Index equals the Target Number
					else if (currentIndex == TargetNum) {
						index += ",";
						index += Integer.toString(j); 
						output.add(index);	 
					}
				} 
			}
		} 			
		
		System.out.println("\nArray:" + Arrays.toString(UserArr)); //output formatting
		System.out.println("Target Number: " + TargetNum);
	return output;
	}
}
