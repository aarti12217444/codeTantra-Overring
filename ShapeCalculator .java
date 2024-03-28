/*Design a class hierarchy with a base class Shape and two derived classes Cube and Cuboid.
The Shape class should have a method calculateVolume() that prints "Calculating volume of Shape."
The Cube class should override the calculateVolume() method to calculate and display the volume of a cube by taking any side (double) of the cube as input from the user.
The Cuboid class should also override the calculateVolume() method to calculate and display the volume of a cuboid by taking the length (double), width (double), and height (double) of the cuboid as input from the user.


Formulas:

Volume of cube = (side)3

Volume of the cuboid = length * width * height



Note:

Print the volume up to 2 decimal places.
The main class has been provided to you in the editor.*/


import java.util.Scanner;


	
class Shape{
	void calculateVolume(){
		System.out.print("Calculating volume of Shape");
	}
}
class Cube extends Shape{
	double s;
	void calculateVolume(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Side of the cube: ");
		s=sc.nextDouble();
		double area=s*s*s;
		System.out.printf("Volume of Cube: %.2f\n",area);
	}
}
class Cuboid extends Shape{
	double l;
	double w;
	double h;
	void calculateVolume(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Length of the cuboid: ");
		l=sc.nextDouble();
		System.out.print("Width of the cuboid: ");
		w=sc.nextDouble();
		System.out.print("Height of the cuboid: ");
		h=sc.nextDouble();
		double area=l*w*h;
		System.out.printf("Volume of Cuboid: %.2f\n",area);
	}
}

public class ShapeCalculator {
    public static void main(String[] args) {
        // Creating instances of the subclasses
        Cube cubeInstance = new Cube();
        Cuboid cuboidInstance = new Cuboid();

        // Calling calculateVolume() for each instance
        cubeInstance.calculateVolume();
        cuboidInstance.calculateVolume();
    }
}
