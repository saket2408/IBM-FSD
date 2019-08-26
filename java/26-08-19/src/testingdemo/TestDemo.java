package testingdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class TestDemo extends TestCase {

	public TestDemo(){
		super();
	}

	@Test
	public void testAddMethod() {
		int x=10;
		int y=20;
		Calculator c=new Calculator(x, y);
		int result = c.addMethod();
		assertEquals(30,result);
	}
}
