package testingdemo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.TestCase;
import junit.framework.TestSuite;

@RunWith(Suite.class)
@SuiteClasses({ TestCalculator.class })

public class AllTests extends TestCase {
	
	public AllTests() {
	TestSuite testsuite = new TestSuite("AllTest");
	
	}



public static void main(String args[]) {
	junit.textui.TestRunner.run(new AllTests());
}

}