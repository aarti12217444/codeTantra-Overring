/*You are designing a payroll system for a company.

Create a base class Employee with attributes name (String), employeeId (int), and salary (double). 
Implement a method calculateSalary that returns the salary.

Create a child class Manager that inherits from Employee and adds an attribute bonus (double).
 Implement a method calculateSalary in the Manager class that overrides the base class method to 
 include the bonus in the salary calculation.

Note: The main class has been provided to you in the editor.
*/


import java.util.Scanner;
class Employee{
		String empName;
		int empId;
		double empSalary;
		
		double calculateSalary(){
			return empSalary;
		}
	}
	class Manager extends Employee{
		double bonus;
		Manager(String empName, int empId, double empSalary,double bonus){
		this.empName=empName;
		this.empId=empId;
		this.empSalary=empSalary;
		this.bonus=bonus;
		}
		double calculateSalary(){
			return bonus + empSalary;
		}
	}
	

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for an employee:");
        System.out.print("Name: ");
        String empName = scanner.next();
        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        System.out.print("Salary: $");
        double empSalary = scanner.nextDouble();

        System.out.println("Enter details for a manager:");
        System.out.print("Bonus: $");
        double bonus = scanner.nextDouble();

        Manager manager = new Manager(empName, empId, empSalary, bonus);

        System.out.println("Employee Details:");
        System.out.println("Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Base Salary: $" + empSalary);

        System.out.println("Manager Details:");
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + manager.calculateSalary());

        scanner.close();
    }
}


