package edu.towson.cis.cosc603.project4.rectangle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The unit test Class for Rectangle.
 */
public class RectangleTest {

	/** Declaring necessary test objects for {@link Point} */
	Point point1, point2, point3, point4;
	
	/** Declaring necessary test objects for {@link Rectangle} */
	Rectangle rect1, rect2;

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
		rect1 = new Rectangle(point1, point2);
		rect2 = new Rectangle(point3, point4);
	}

	/**
	 * Test for the constructor method of the {@link Rectangle} class.
	 */
	@Test
	public void testRectangle() {
		assertEquals(2.0, rect1.getPoint1().getX(), 0.001);
		assertEquals(2.0, rect1.getPoint1().getY(),0.001);
		assertEquals(4.0, rect1.getPoint2().getX(),0.001);
		assertEquals(7.0, rect1.getPoint2().getY(),0.001);
		assertEquals(2.0, rect2.getPoint1().getX(),0.001);
		assertEquals(6.0, rect2.getPoint1().getY(),0.001);
		assertEquals(4.0, rect2.getPoint2().getX(),0.001);
		assertEquals(3.0, rect2.getPoint2().getY(),0.001);
	}
	
	/**
	 * Test for the getArea() method of the {@link Rectangle} class.
	 */
	@Test
	public void testGetArea() {
		assertEquals(10.0, rect1.getArea(),0.001);
		assertEquals(6.0, rect2.getArea(),0.001);
	}

	/**
	 * Test for the getDiagonal() method of the {@link Rectangle} class.
	 */
	@Test
	public void testGetDiagonal() {
		assertEquals(5.3852, rect1.getDiagonal(), 0.0001);
		assertEquals(3.6056, rect2.getDiagonal(), 0.0001);
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
		rect1 = null;
		rect2 = null;
	}
}
