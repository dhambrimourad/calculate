package com.dineshvelhal.javaprojects.maths.tests;

import org.testng.annotations.Test;

import com.dineshvelhal.javaprojects.maths.Maths;

import org.testng.annotations.BeforeTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.testng.annotations.AfterTest;

public class SmokeTests {
	Maths math;
	
	@Test(description = "Addition Test")
	public void addTest() {
		System.out.println("@Test Inside addTest");
		
		assertEquals(5, math.add(2, 3));
	}
	
	@Test(description = "Subtraction Test")
	public void subtractTest() {
		System.out.println("@Test Inside subtractTest");
		
		assertEquals(5, math.subtract(7, 2));
	}


	@BeforeTest
	public void initiate_browser() {
		System.out.println("@Before Inside setUp");
		math = new Maths();
	}

	@AfterTest
	public void close_browser() {
		System.out.println("@After Inside tearDown\n*********************************");
		math = null;
	}

}
