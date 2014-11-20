/*
 *RectangleArea.java
 *@author D Caprani
 *2/10/2014
 */

 import java.util.*;
 public class RectangleArea{
 	public static void main(String []args){
		//declare
		double length;
		double width;
		double AreaRectangle;
		String units;

	 	//initialize variables
	 	length = 0;
	 	width = 0;
	 	units = new String();

		//prompt
		Scanner keyboard = new Scanner(System.in);

		System.out.print("What is the length of the room?");
		length = keyboard.nextDouble();
		System.out.print("What is the width of the room?");
		width = keyboard.nextDouble();
		System.out.println("What are the units of measurement?");
		units = keyboard.next();

		//calculation
		AreaRectangle = length * width;

		//display results
		System.out.print("The area iof a room with a length of " + length + "\n and a width of " + width + " is " + AreaRectangle + " square " +units);
	}
 }

