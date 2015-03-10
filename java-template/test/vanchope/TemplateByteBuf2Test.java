/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vanchope;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ivan
 */
public class TemplateByteBuf2Test {
	
	public TemplateByteBuf2Test() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
	}

	/**
	 * Test of run method, of class TemplateByteBuf2.
	 */
	@Test
	public void testRun() {
		System.out.println("run");
		TemplateByteBuf2 instance = new TemplateByteBuf2();
		instance.run();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of main method, of class TemplateByteBuf2.
	 */
	@Test
	public void testMain() {
		System.out.println("main");
		String[] args = null;
		TemplateByteBuf2.main(args);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
	@Test
	public void testBinarySearch(){
		System.out.println("Alg.binarySearch");
		TemplateByteBuf2.Alg.BinarySearch bs = new TemplateByteBuf2.Alg.BinarySearch();
		bs.bc = new TemplateByteBuf2.Alg.BooleanChecker() {
			@Override
			public boolean check(long arg) {
				return arg>=5;
			}
		};
		long res = bs.search(-1, 11)[1];
		assertEquals(5, res);				
	}
	
}
