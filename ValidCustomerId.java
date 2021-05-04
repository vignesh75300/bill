package com.vignesh.bill;
//Java program to validate a customer using Regular Expression or ReGex
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidCustomerId {

	/**
	 * This Function is Used to Validate the customerId
	 * @param customerId
	 * @return
	 */

	public static boolean isValidCustomerId(String customerId) {
		// If the customerId is empty return false

		if (customerId == null) {
			return false;
		}

		// ReGex to check valid customerId and Compile the ReGex
		Pattern p = Pattern.compile("[a-z]{3}[0-9]{5}");

		Matcher m = p.matcher(customerId);

		// Return if the customerId is matched the ReGex
		return m.matches();
	}
}
