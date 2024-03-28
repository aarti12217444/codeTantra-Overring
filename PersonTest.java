/*You are tasked with creating a Java program to model different types of individuals. Design a class Person with a method introduce() that prints "Introducing a person".



Next, create two subclasses, Student and Teacher, which extend the Person class's functionality by overriding the introduce() method.



Here are the specific requirements for each subclass:



Student:

Override the introduce() method in the Student class to prompt the user for input regarding the student's grade.
Print a message indicating that the person is a student and mention the grade (int). For example, "I am a student in grade {grade}".
Teacher:

Override the introduce() method in the Teacher class to prompt the user for input regarding the subject (String) taught by the teacher.
Print a message indicating that the person is a teacher and mention the subject. For example, "I am a teacher who teaches {subject}".


Note: The main class has been provided to you in the editor.*/


import java.util.Scanner;

	// write your code here..
class Person{
	void introduce(){
		System.out.println("Introducing a person");
	}
}
class Student extends Person{
	int grade;
	void introduce(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Grade of student: ");
		grade=sc.nextInt();
		System.out.println("I am a student in grade "+grade);
	}
}
class Teacher extends Person{
	String sub;
	void introduce(){
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Subject taught by the teacher: ");
		sub=sc.nextLine();
		System.out.println("I am a teacher who teaches "+sub);
	}
}
public class PersonTest {
    public static void main(String[] args) {
        Person genericPerson = new Person();
        genericPerson.introduce();

        Student student = new Student();
        student.introduce();

        Teacher teacher = new Teacher();
        teacher.introduce();
    }
}