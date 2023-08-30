/**
 * File: Circle.java
 * 
 * Print the area of a circle with two different radii
 */

public class Circle {
	
	public static void main(String[] args) {
		final double PI = 3.14159;
		int radius = 10;
		double area = PI * radius * radius;
		double circumference = 2 * PI * radius;

		System.out.println("The area of a circle with radius " + radius + " is " + area);
		System.out.println("The circumference of a circle with radius " + radius + " is " + circumference);

		radius = 20;
		area = PI * radius * radius;
		circumference = 2 * PI * radius;
		
		System.out.println("The area of a circle with radius " + radius + " is " + area);
		System.out.println("The circumference of a circle with radius " + radius + " is " + circumference);
	}
}
