package cse360assign3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cse360assign3.Calculator;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testCalculator() {
		Calculator tester = new Calculator();
		assertNotNull(tester);
	}

	@Test
	public final void testGetTotal() {
		
		Calculator tester = new Calculator();
		assertEquals(tester.getTotal(),0);
		tester.add(20);
		assertEquals(tester.getTotal(),20);
		tester.subtract(10);
		assertEquals(tester.getTotal(),10);
		tester.multiply(3);
		assertEquals(tester.getTotal(),30);
		tester.divide(5);
		assertEquals(tester.getTotal(),6);
			
	}

	@Test
	public final void testAdd() {
		Calculator tester = new Calculator();
		tester.add(20);
		assertEquals(tester.getTotal(),20);
		tester.add(5);
		assertEquals(tester.getTotal(),25);
		tester.add(11);
		assertEquals(tester.getTotal(),36);
		
	
	
	}

	@Test
	public final void testSubtract() {
		
		Calculator tester = new Calculator();
		tester.add(200);
		tester.subtract(50);
		assertEquals(tester.getTotal(),150);
		tester.subtract(25);
		assertEquals(tester.getTotal(),125);
		tester.subtract(124);
		assertEquals(tester.getTotal(),1);
		
	}

	@Test
	public final void testMultiply() {
		
		Calculator tester = new Calculator();
		tester.add(5);
		tester.multiply(5);
		assertEquals(tester.getTotal(),25);
		tester.multiply(5);
		assertEquals(tester.getTotal(),125);

	}

	@Test
	public final void testDivide() {
		Calculator tester = new Calculator();
		tester.add(200);
		tester.divide(0);
		assertEquals(tester.getTotal(),0);
		tester.add(200);
		tester.divide(10);
		assertEquals(tester.getTotal(),20);
		tester.divide(4);
		assertEquals(tester.getTotal(),5);


	}

	@Test
	public final void testGetHistory() {
		fail("Not yet implemented"); // TODO
	}

}
