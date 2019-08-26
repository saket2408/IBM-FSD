package testingdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import junit.textui.TestRunner;

public class TestCalculator extends TestCase{
	
	int x;
	int y;
	int result;
	Calculator c;
	
//	@Override
//	protected void setUp() throws Exception {
//		// TODO Auto-generated method stub
//		x=10;
//		y=20;
//		
//		
//	}
//
//	@Override
//	protected void tearDown() throws Exception {
//		// TODO Auto-generated method stub
//		super.tearDown();
//		
//		
//	}

	public TestCalculator() {
		super();
	}

	@Test
	public void testAddMethod() {
		x=10;
		y=20;
		c=new Calculator(x, y);
		result = c.addMethod();
		assertEquals(30,result);
	}

	@Test
	public void testSubMethod() {
		x=10;
		y=20;
		Calculator c =new Calculator(x, y);
		result = c.subMethod();
		assertEquals(-10,result);
	}

	@Test
	public void testGreaterMethod() {
		x=10;
		y=20;
		Calculator c =new Calculator(x, y);
		result = c.greaterMethod();
		assertEquals(-1,result);
	}

	

	
}
