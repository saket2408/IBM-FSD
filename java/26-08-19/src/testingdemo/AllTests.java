package testingdemo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.TestCase;
import junit.framework.TestSuite;

@RunWith(Suite.class)
@SuiteClasses({ TestCalculator.class, TestDemo.class })

public class AllTests extends TestCase {

}