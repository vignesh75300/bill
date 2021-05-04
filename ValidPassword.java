package com.vignesh.bill;

//Java program to validate a password using Regular Expression or ReGex
import java.util.regex.*;

public class ValidPassword {
	/**
	 * Function to validate the password
	 * 
	 * @param password
	 * @return
	 */

	public static boolean isValidPassword(String password) {
		// If the password is empty return false
		if (password == null) {
			return false;
		}
		// ReGex to check valid customerId and Compile the ReGex
		Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");

		Matcher m = p.matcher(password);

		// Return if the password is matched the ReGex
		return m.matches();
	}

}
