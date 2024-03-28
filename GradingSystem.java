/*You are developing a grading system for a school.
Create a base class Student with attributes name (string), id (int), and grade (char).
 Implement a method displayDetails that prints the student's details.
Create a child class GraduateStudent that inherits from Student and adds an attribute thesisTopic (string).
 Implement a method displayDetails in the GraduateStudent class that overrides the base class method and displays 
 the thesisTopic.
Note: The main class has been provided to you in the editor.﻿*/

import java.util.Scanner;
class Student{
	String studentName;
	int studentId;
	char studentGrade;
	
	void displayDetails(){
		System.out.println("Student Details:");
		System.out.println("Name: " + studentName);
		System.out.println("ID: " + studentId);
		System.out.println("Grade: " + studentGrade);
	}
}
class GraduateStudent extends Student{
	String thesisTopic;
	//@Override
	
	GraduateStudent(String studentName, int studentId,char studentGrade,String thesisTopic){
		this.studentName=studentName;
		this.studentId=studentId;
		this.studentGrade=studentGrade;
		this.thesisTopic=thesisTopic;
	}
	void displayDetails(){
		super.displayDetails();
		System.out.println("Thesis Topic: " + thesisTopic);
	}
}
public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for a student:");
        System.out.print("Name: ");
        String studentName = scanner.nextLine(); // Read the whole line, including spaces
        System.out.print("ID: ");
        int studentId = scanner.nextInt();
        System.out.print("Grade: ");
        char studentGrade = scanner.next().charAt(0);

        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter details for a graduate student:");
        System.out.print("Thesis Topic: ");
        String thesisTopic = scanner.nextLine();

        GraduateStudent graduateStudent = new GraduateStudent(studentName, studentId, studentGrade, thesisTopic);

        graduateStudent.displayDetails();

        scanner.close();
    }
}






