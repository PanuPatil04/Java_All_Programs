package com.dkte;
import java.util.Scanner;
public class Employee {
	int empid;
	String name;
	double sal;
	
	public Employee() {
		System.out.println("Employee()");
	}

	public Employee(int empid,String name,double sal) {
		this.empid=empid;
		this.name=name;
		this.sal=sal;
	}
	
	public void accept(Scanner sc) {
		System.out.println("Enter Emp Id:");
		this.empid=sc.nextInt();
		System.out.println("Enter Name:");
		this.name=sc.next();
		System.out.println("Enter Salary:");
		this.sal=sc.nextDouble();
	}
	
	public void display() {
		System.out.println("EmpId="+empid);
		System.out.println("Name="+name);
		System.out.println("Salary"+sal);
	}
	
}
