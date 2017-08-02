package com.proxibanque.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTestCase {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.out.println("Avant tous les tests");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("après tous les tests");
	
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Avant chaque  test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("aprés chaque  test");
	}

	@Test
	public void testSetCreationDate() {
		System.out.println("testSetCreationDate");
	}

	@Test
	public void testGetBalance() {
		System.out.println("testGetBalance");
	}

}
