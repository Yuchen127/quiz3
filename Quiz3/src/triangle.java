import java.lang.Math;
/*
 * Create a class named Triangle that extends GeometricObject
 */
public class triangle extends GeometricObject {
	/*
	 * Three private double data fields set defult to 1.0
	 */
	private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    
    /*
     * Create a no-arg constructor of default triangle
     */
    public triangle(){
    }
    
    /*
     * Create a constructor that creates a triangle with the side1, side2 and side3.
     */
    public triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    /*
     * Getters and setters for side1, side2 and side3.
     */
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	/*
	 * Method to calculate and return the perimeter of the triangle.
	 */
	public double getPerimeter(){
		return (side1 + side2 + side3);
	}
	
	/*
	 * Method to calculate and return the area of the triangle.
	 */
	public double getArea(){
		double p = getPerimeter() / 2;
		return (Math.sqrt(p * ((p - side1) * (p - side2) * (p - side3))));
	}
	
	/*
	 * Method to output the description of the triangle.
	 */
	public String toString() {
	    return (" Triangle's side1 = " + side1 + "Triangle's side2 = " + side2
	           + " Triangle's side3 = " + side3 + "Triangle's area =" + getArea() +
	           "Triangle's perimeter = " + getPerimeter());
	    }


}

