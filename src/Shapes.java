/**
* CS 111 Section No. 002
* Lab Assignment 1
* @author Samuel Harris 
**/

public class Shapes {
	
	/**
	 * Draws the circle on the center of the canvas with radius r
	 * @param r - radius of the circle
	 */
	
	public static void drawCircle(double r) {
		StdDraw.circle(0, 0, r);
	}

	/**
	 * Determines the area of the circle and prints the value
	 * @param r - radius of the circle
	 */
	
	public static void computeAreaCircle(double r) {
		System.out.println(Math.PI * (r * r));
	}

	/**
	 * Draws the square on the center of the canvas with side s
	 * @param s - side of the square
	 */
	
	public static void drawSquare(double s) {
		//The side needs to be divided by two since the method requires half of the side length.
		s /= 2; 
		StdDraw.square(0, 0, s); 
	}

	/**
	 * Determines the area of the square and prints the value
	 * @param s - side of the square
	 */
	
	public static void computeAreaSquare(double s) {
		System.out.println(s * s);
	}

	/**
	 * Draws the rectangle on the center of the canvas with height h and width w
	 * @param h - height of the rectangle
	 * @param w - width of the rectangle
	 */
	
	public static void drawRectangle(double h, double w) {
		//Both the height and the width need to be divided by two to fit the methods requirements.
		h /= 2;
		w /= 2;
		StdDraw.rectangle(0, 0, w, h);
	}

	/**
	 * Determines the area of the rectangle and prints the value
	 * @param h - height of the rectangle
	 * @param w - width of the rectangle
	 */
	
	public static void computeAreaRectangle(double h, double w) {
		System.out.println(h * w);
	}
}
