package assg5_motleyj21;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestExtendedCircle {
	
	private ExtendedCircle c1,c2,c3;
	private Point c4,c5;
	static double D = 0.00001;

	@Before
	public void setUp() {
		c5 = new Point(0,0);
		c1 = new ExtendedCircle();
		c2 = new ExtendedCircle(9);
		c4 = new Point(1,1);
		c3 = new ExtendedCircle(6,c4);
		
	}
	
	
	

	@Test
	public void testDefaultConstructor() {
		assertEquals("Radius value: ", 1, c1.getRadius(),D);
		assertEquals("Point vaule: ", c5, c1.getCenter());
	}
	
	
	@Test
	public void testOneParameterConstructor() {
		assertEquals("Radius value: ", 9, c2.getRadius(),D);
		assertEquals("Point vaule: ", c5, c2.getCenter());
	}
	
	@Test
	public void testTwoParameterConstructor() {
		assertEquals("Radius value: ", 6, c3.getRadius(),D);
		assertEquals("Center vaule: ", c4, c3.getCenter());
	}
	
	@Test
	public void testSetCenterMethod() {
		c1.setCenter(c4);
		assertEquals("Point value: ", c4, c1.getCenter());
	}
	
	
	@Test
	public void testSetRadiusMethod() {
		c3.setRadius(6);
		assertEquals("Point value: ", 6, c3.getRadius(),D);
	}
	
	
	@Test
	public void testAreaMethod() {
		c2.setRadius(6);
		assertEquals("Area value: ", 113.04, c2.compArea(),D);
	}
	
	@Test
	public void testCircumfernceMethod() {
		c2.setRadius(4);
		assertEquals("value: ", 50.24, c2.compArea(),D);
	}
	
	@Test
	public void testExtendedCircleMethod() {
		c3.shift(6,7);
		assertEquals("Value: ", c3, c1.getCenter());
	}
	
	@Test
	public void testOverlapMethod() {
		c3.shift(6,7);
		assertEquals("Value: ", c3, c1.getCenter());
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void testEquals() {
		assertFalse("Value: ", c4.equals(null));
		assertFalse("Value: ", c1.equals("String"));
		c1.setRadius(1);
		c2.setRadius(1);
		c1.setCenter(c4);
		c2.setCenter(c4);
		assertTrue(c1.equals(c2));
		c1.setRadius(4);
		assertFalse(c1.equals(c2));
	}
	
	
	
	
	
	

}
