package assg5_motleyj21;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


import org.junit.Test;

public class PointTest {
	
	private Point x1,y1;
	static double D = 0.01;

	@Before
	public void setUp() {
		x1 = new Point();
		y1 = new Point(4,5);
	}
	
	@Test
	public void testDefaultConstructor() {
		assertEquals("Point value: ", 0, x1.getX());
		assertEquals("Point value: ", 0, x1.getY());
	}
	
	@Test
	public void testTwoParameterConstructor() {
		assertEquals("Point value: ", 4, y1.getX());
		assertEquals("Point value: ", 5, y1.getY());
	}
	
	@Test
	public void testSetMethod() {
		x1.setX(6);
		assertEquals("Point value: ", 6, x1.getX());
		x1.setY(4);
		assertEquals("Point value: ", 4, x1.getY());
	}
	
	@Test
	public void testToString() {
		assertEquals("Point value: ", "(0,0)" , x1.toString());
	}
	
	
	@Test
	public void testDistanceMethod() {
		assertEquals("Point value: ", 6.4, x1.distance(y1),D);
	}

	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void testEquals() {
		assertFalse("Point value: ", x1.equals(null));
		assertFalse("Point value: ", x1.equals("String"));
		x1.setX(1);
		x1.setY(1);
		y1.setX(1);
		y1.setY(1);
		assertTrue(x1.equals(y1));
		x1.setX(4);
		assertFalse(x1.equals(y1));
	}
	
	
	
	
	


}
