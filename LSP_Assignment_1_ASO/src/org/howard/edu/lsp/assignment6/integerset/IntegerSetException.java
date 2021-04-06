package org.howard.edu.lsp.assignment6.integerset; //Same as Assignment 4.
/** 
 * Custom IntegerSetException class inherits from the Exception class. 
 * Throws custom IntegerSetException error if set length is less than or equal to zero.
 */
public class IntegerSetException extends Exception {
	/**
	 * Method throws IntegerSetException when called from largest() and smallest() methods.
	 * @param ExceptionMsg, String defines the error message which will be printed
	 * by the largest() and smallest() methods.
	 */
	public IntegerSetException(String ExceptionMsg) { 
		super(ExceptionMsg); //Exception Message is defined under largest() and smallest() methods
	}
}
