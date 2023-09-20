/**
 * Jonathan Motley THis program creates a point and has methods to use them in different ways
 */

package assg5_motleyj21;


public class Point {
	
	private int x;
	private int y;
	
	/**
	 * This method is a default constructor that sets x and y to 0
	 */
	public Point() {
		x = 0;
		y = 0;
	}
	
	/**
	 * This method is a constructor but sets x
	 * @param newX
	 * @param newY
	 */
	public Point(int newX, int newY) {
		x = newX;
		y = newY;
	}
	
	/**
	 * This method is a get method for X
	 * @return
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * This method is a get method for Y
	 * @return
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * This method is a set method for X
	 * @param newX
	 */
	public void setX(int newX) {
		x = newX;
	}
	
	/**
	 * This method is a set method for Y
	 * @param newY
	 */
	public void setY(int newY) {
		y = newY;
	}
	
	/**
	 * This is a method to write the string in a coordinate form
	 */
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	/**
	 * This method computes the distance between two points
	 * @param newXYY
	 * @return the distance 
	 */
	public double distance(Point newXY) {
		double xPoint = newXY.x - this.x;
		double yPoint = newXY.y - this.y;
		yPoint = yPoint * yPoint;
		xPoint = xPoint * xPoint;
		yPoint = Math.abs(yPoint);
		xPoint = Math.abs(xPoint);
		return Math.sqrt(yPoint+xPoint);	
	}
	
	/**
	 * This method computes if two lines are equal and returns true if they are
	 */
	public boolean equals(Object equalCor) {
		if(equalCor == null) {
			return false;
		}
		if(equalCor instanceof Point) {
			Point temp = (Point)equalCor;
			return (this.y == temp.y && this.x == temp.x);
	}
		else
			return false;
			
					
		}
	}