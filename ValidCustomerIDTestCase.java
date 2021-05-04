package com.vignesh.bill;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidCustomerIDTestCase {

	@Test
	public void test1() {

		String customerId = "vig03324";
		boolean value = ValidCustomerId.isValidCustomerId(customerId);
		assertTrue(value);
	}

	@Test
	public void test2() {

		String customerId = "vig 03324";
		boolean value = ValidCustomerId.isValidCustomerId(customerId);
		assertFalse(value);
	}

	@Test
	public void test3() {

		String customerId = "vign3324";
		boolean value = ValidCustomerId.isValidCustomerId(customerId);
		assertFalse(value);
	}

	@Test
	public void test4() {

		String customerId = "vigneshk";
		boolean value = ValidCustomerId.isValidCustomerId(customerId);
		assertFalse(value);
	}

	@Test
	public void test5() {

		String customerId = "12345678";
		boolean value = ValidCustomerId.isValidCustomerId(customerId);
		assertFalse(value);
	}

}
