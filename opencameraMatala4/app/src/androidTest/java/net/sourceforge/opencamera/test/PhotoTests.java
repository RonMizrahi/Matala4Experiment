package net.sourceforge.opencamera.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class PhotoTests {
	// Tests related to taking photos; note that tests to do with photo mode that don't take photos are still part of MainTests
	public static Test suite() {
		TestSuite suite = new TestSuite(MainTests.class.getName());
		// put these tests first as they require various permissions be allowed, that can only be set by user action
		suite.addTest(TestSuite.createTest(MainActivityTest.class, "testLocationOn"));
		suite.addTest(TestSuite.createTest(MainActivityTest.class, "testLocationOn"));

		return suite;
    }
}
