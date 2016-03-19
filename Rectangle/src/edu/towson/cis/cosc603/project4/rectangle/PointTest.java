package edu.towson.cis.cosc603.project4.rectangle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The unit test Class for Rectangle.
 */
public class PointTest {

	/** Declaring necessary test objects for {@link Point} */
	Point point1, point2, point3, point4;

	/**
	 * Initializes the necessary test objects for the test cases to use.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		point1 = new Point(2.0, 2.0);
		point2 = new Point(4.0, 7.0);
		point3 = new Point(2.0, 6.0);
		point4 = new Point(4.0, 3.0);
	}


	/**
	 * Test for the constructor method of the {@link Point} class.
	 */
	@Test
	public void testPoint() {
		assertEquals(2.0, point1.getX(),0.001);
		assertEquals(2.0, point1.getY(),0.001);
		assertEquals(4.0, point2.getX(),0.001);
		assertEquals(7.0, point2.getY(),0.001);
		assertEquals(2.0, point3.getX(),0.001);
		assertEquals(6.0, point3.getY(),0.001);
		assertEquals(4.0, point4.getX(),0.001);
		assertEquals(3.0, point4.getY(),0.001);
	}
	
	/**
	 * Cleans up test objects after a test case is executed.
	 */
	@After
	public void tearDown(){
		point1 = null;
		point2 = null;
		point3 = null;
		point4 = null;
	}
}
