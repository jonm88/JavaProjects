/**
 * Jonathan Motley This program creates circles and has methods to use the circles in diffrent ways
 */

package assg5_motleyj21;


public class ExtendedCircle {


	private double radius;
	private Point center;
	
	/**
	 * This method is a default constructor that sets the radius to 1 and x and y to 0
	 */
	public ExtendedCircle() {
		radius = 1;
		center = new Point();
 		center.setX(0);
		center.setY(0);
	}
	
	/**
	 * This method is a default constructor that has the radius as a parameter and sets the center to 
	 * @param newRadius
	 */
	public ExtendedCircle(double newRadius) {
		radius = newRadius;
		center = new Point();
		center.setX(0);
		center.setY(0);
		}
	/**
	 * This constructor sets both the radius and the center to parameters
	 * @param theRadius
	 * @param theCenter
	 */
	public ExtendedCircle(double theRadius, Point theCenter) {
		radius = theRadius;
		center = new Point(theCenter.getX(), theCenter.getY());
	}
	
	/**
	 * This method gets the center point 
	 * @return center
	 */
	public Point getCenter() {
		return center;
	}
	
	/**
	 * This method gets the radius 
	 * @return radius
	 */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * This method sets the center to a new value
	 */
	public void setCenter(Point newCenter) {
		center = newCenter; 
	}
	 /**
	  * This method gets the radius and sets it to a new value
	  * @return
	  */
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	/**
	 * This method computes the area 
	 * @return area
	 */
	public double compArea() {
		double area = 3.14 * radius * radius;
		return area;
	}
	
	/**
	 * This method computes the circumference
	 * @return circumference
	 */
	public double compCircumference() {
		double circumference = 3.14 * 2 * radius;
		return circumference;
	}
	
	/**
	 * This method makes a string out of the radius and a circle
	 */
	public String toString() {
		String CircleAndRadius =  "Radius" + radius + "\n" + "Center" + center.toString();
		return CircleAndRadius;
	}
	
	/**
	 * This method determines if a point is inside the circle or not
	 * @param xYPos
	 * @return -1 if it is not, 1 if it is bigger or 0 if they are the same
	 */
	public int positionToCircle(Point xYPos) {
		if(center.distance(xYPos) < radius) {
			return -1;
		}
		else if(center.distance(xYPos) > radius) {
			return 1;
		}
		else
			return 0;
		}
	
	/**
	 * This method shifts the circle
	 * @param newX
	 * @param newY
	 * @return new circle
	 */
	public ExtendedCircle shift(int newX, int newY){
		Point CenterPoint = new Point(newX, newY); 
		ExtendedCircle tempCircle = new ExtendedCircle(radius, CenterPoint);
		return tempCircle;
	}
	
	/**
	 * This method scales the circle by how much the user wants
	 * @param overlap
	 * @return new circle
	 */
	public boolean overlap(ExtendedCircle overlap) {
		if(this.center.distance(overlap.center) > (this.radius + overlap.radius)) {
			return false;
	}
		else return true;
	}
	
	/**
	 * This method test if two circles are equal 
	 * @param equalCor
	 * @return true if they are equal or false if it is not
	 */
	public boolean Equals(ExtendedCircle equalCor) {
		if(equalCor == null) {
			return false;
		}
		if(equalCor instanceof ExtendedCircle) {
			ExtendedCircle temp = (ExtendedCircle)equalCor;
			return (this.radius == temp.radius && this.center.equals(temp.center));
		}
			else
				return false;
			
					
		
	}
	
	
	
}