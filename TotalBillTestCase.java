package com.vignesh.bill;

import static org.junit.Assert.*;

import org.junit.Test;

public class TotalBillTestCase {

	@Test
	public void test() {
		int units = 100;
		String type = "Home";
		double billHome = TotalBill.getBill(type, units);

		assertEquals(0.0f, billHome, 0);

	}

	@Test
	public void test1() {
		int units = 200;
		String type = "Commercial";
		double billCommercial = TotalBill.getBill(type, units);

		assertEquals(4000.0f, billCommercial, 0);

	}

	@Test
	public void test2() {
		int units = 300;
		String type = "Agriculture";
		double billAgriculture = TotalBill.getBill(type, units);

		assertEquals(6000.0f, billAgriculture, 0);

	}

}
