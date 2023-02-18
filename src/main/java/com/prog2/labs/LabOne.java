package com.prog2.labs;
import java.util.Random;

/**
 * @author adinashby
 *
 */
public class LabOne {

	/**
	 * Write your test code below in the main.
	 *
	 */
	public static void main(String[] args) {
		
	}
	
	/**
	 * 1) Write a Java method to concatenate a given string to the end of another string.
	 * 
	 * @param firstString first input string.
	 * @param secondString second input string.
	 *
	 * @return result concatenated string.
	 */
	
	public String concatStringToEnd(String firstString, String secondString) {
		return firstString + " " + secondString;
	}
	
	/**
	 * 2) Write a Java method to check whether a given string ends with 
	 * the contents of another string. 
	 * You can ask the user for the input strings.
	 * 
	 * @param firstString first input string.
	 * @param secondString second input string.
	 *
	 * @return result true if the first string is ending with the second string.
	 */
	
	public boolean doesEndWithSecondString(String firstString, String secondString) {
	int firstLength = firstString.length();
        int secondLength = secondString.length();
        if (secondLength > firstLength) {
            return false;
        }            
        //String endOfString = firstString.substring( firstLength- secondLength);
        return true;
	}
	
	/**
	 * 3) Write a Java method to generate random integers in a specific range.
	 * 
	 * @param startingNumber starting number.
	 * @param endingNumber ending number.
	 *
	 * @return result randomly generated number within a range.
	 */
	
	public int randomIntegerGenerator(int startingNumber, int endingNumber) {
	Random random = new Random();	
         return random.nextInt(endingNumber - startingNumber + 1) + startingNumber;
	}
	
	/**
	 * 4) Write a Java method to check whether a password is valid or not. 
	 * A valid password should contain an uppercase letter, lowercase letter, and digit.
	 * 
	 * @param password input password.
	 *
	 * @return result true if the password is valid.
	 */
	
	public boolean isPasswordValid(String password) {
		boolean hasUppercase = false;
                boolean hasLowercase = false;
                boolean hasDigit = false;
                
                if (password.length() < 8){
                    return false;
                }
                for (char c : password.toCharArray()){
                    if (Character.isUpperCase(c)){
                        hasUppercase = true;
                    } else if (Character.isLowerCase(c)){
                        hasLowercase = true;
                    } else if (Character.isDigit(c)){
                        hasDigit = true;
                    }
                }
                return hasUppercase && hasLowercase && hasDigit;
	}

}
