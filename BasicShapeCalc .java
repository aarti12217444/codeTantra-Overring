/*You are tasked with implementing a basic shape calculator in Java.

Design a class hierarchy with a base class Shape and two derived classes Square and Triangle.
The Shape class should have a method calculateArea() that prints "Calculating area of Shape."
The Square class should override the calculateArea() method to calculate and display the area of a square by taking
the side (double) of the square as input from the user,
The Triangle class should also override the calculateArea() method to calculate and display the area of a 
triangle by taking the base (double) and height (double) of the triangle as input from the user.


Formulas:

Area of the square = (side)2

Area of the triangle = 0.5 * base * height



Note:

Print the area up to 2 decimal places.
The main class has been provided to you in the editor.*/

import java.util.Scanner;

/*class  Shape{
	void calculateArea(){
		System.out.println("Calculating area of the shape: ");
	}
}
class Square extends Shape{
	double s;
	void calculateArea(){
		System.out.println("Side of square: ");
		s=sc.nextDouble();
		double sArea=s*s;
		System.out.printf("Area: %.2f\n ",sArea);
		
class Triangle extends Shape{
	double b;
	double h
	void calculateArea(){
		System.out.println("Basb of Triangle: ");
		b=sc.nextDouble();
		System.out.println("Height of the Triagle: ");
		h=sc.nextDouble();
		double area=0.5*b*h;
		System.out.printf("Area of triangle: %.2f",area);
	}
}
class BasicShapeCalc{
	public static void main(String[] args){
		Shape h=new Shape();
		h.calculateArea();
		Square s=new Square();
		s.calculateArea();
		Triangle t=new Triangle();
		t.calculateArea();
	}
}*/
		

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	class Shape{
		void calculateArea(){
		System.out.println("Calculating are aof Shape");
		}
	}
	class Square extends Shape{
		double side;
		void calculateArea(){
			Scanner sc=new Scanner(System.in);
			System.out.print("Side of the square: ");
			side=sc.nextDouble();
			double area=side*side;
			System.out.printf("Area of Square: %.2f\n",area);
		}
	}
	class Triangle extends Shape{
		double base;
		double height;
		void calculateArea(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Base of the triangle: ");
		base=sc.nextDouble();
		System.out.print("Height of the triangle: ");
		height=sc.nextDouble();
		System.out.printf("Area of Triangle: %.2f\n",0.5*base*height);
		}
	}

public class BasicShapeCalc {
    public static void main(String[] args) {
        // Creating instances of the subclasses
        Square squareInstance = new Square();
        Triangle triangleInstance = new Triangle();

        // Calling calculateArea() for each instance
        squareInstance.calculateArea();
        triangleInstance.calculateArea();
    }
}