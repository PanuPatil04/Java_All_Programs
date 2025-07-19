package com.dkte;
import java.util.Scanner;
public class Employee extends Person {
	int id;
	String dept;
	double sal;
	Date doj;
	
	public Employee() {
		doj=new Date();
	}
	
	public void accept(Scanner sc) {
		super.acceptP(sc);
		System.out.println("Enter Employee ID:");
		this.id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Department:");
		this.dept=sc.next();
		System.out.println("Enter the Salary:");
		this.sal=sc.nextDouble();
		System.out.println("Enter Date of joining:");
		doj.acceptDate(sc);
	}
	
	public void display() {
		super.displayP();
		System.out.println("Employee ID:"+id);
		System.out.println("Department:"+dept);
		System.out.println("Salary:"+sal);
		doj.toString();
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", dept=" + dept + ", sal=" + sal + "]";
	}
	
	

}
