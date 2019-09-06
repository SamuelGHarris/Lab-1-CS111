/**
* CS 111 Section No. 002
* Lab Assignment 1
* @author Samuel Harris 
**/

//Importing the Scanner class for interaction with the keyboard
import java.util.Scanner;

public class DrawShapes {
	public static void main(String args[]) {
		// Making object of Scanner class
		// Declaring/Initializing variables
		Scanner input = new Scanner(System.in);
		String response = " ";
		double radius = 0;
		double side = 0;
		double height = 0;
		double width = 0;

		//Makes sure the output window is a reasonable size
		StdDraw.setXscale(-10, 10);
		StdDraw.setYscale(-10, 10);
		
		while (!(response.equalsIgnoreCase("quit"))) {
			
			//Displays the menu in the console and saves the users input
			System.out.println("Which shape do you want to plot? Circle, Square, or Rectangle? Enter\r\n"
					+ "Quit to exit the program.");
			response = input.nextLine();
			
			if (response.equalsIgnoreCase("circle")) {
				System.out.println("Please enter the radius length.");
				radius = input.nextDouble();
				input.nextLine();
				Shapes.drawCircle(radius);
				System.out.print("\nThe area of your circle is ");
				Shapes.computeAreaCircle(radius);
				System.out.println();
			} else if (response.equalsIgnoreCase("square")) {
				System.out.println("Please enter the side length.");
				side = input.nextDouble();
				input.nextLine();
				Shapes.drawSquare(side);
				System.out.print("\nThe area of your square is ");
				Shapes.computeAreaSquare(side);
				System.out.println();
			} else if (response.equalsIgnoreCase("rectangle")) {
				System.out.println("Please enter the height of the rectangle.");
				height = input.nextDouble();
				System.out.println("Please enter the width of the rectangle.");
				width = input.nextDouble();				
				input.nextLine();
				Shapes.drawRectangle(height, width);
				System.out.print("The area of your rectangle is ");
				Shapes.computeAreaRectangle(height, width);
				System.out.println();
			} 
			
			//Gives the user information as to why the loop was ended
			else if (!(response.equalsIgnoreCase("quit"))) {
				System.out.println("You entered an unsupported word.\nPlease try again.");
			}
		}

		//Exit message
		System.out.println("Have a good day...");
		input.close();
	}
}
