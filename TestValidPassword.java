package com.vignesh.bill;

public class TestValidPassword {

	public static void main(String[] args) {
		String password = "Viki@75300";

		if (ValidPassword.isValidPassword(password))
			System.out.println("Valid password");
		else
			System.out.println("Invalid password");

	}
}
