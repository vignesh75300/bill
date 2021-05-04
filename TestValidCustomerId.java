package com.vignesh.bill;

public class TestValidCustomerId {

	public static void main(String[] args) {
		String customerId = "vign1234";

		if (ValidCustomerId.isValidCustomerId(customerId))
			System.out.println("Valid Customer Id");
		else
			System.out.println("Invalid Customer Id");
	}
}
