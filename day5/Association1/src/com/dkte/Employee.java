package com.dkte;
import java.util.Scanner;
public class Employee {
	int empid;
	String name;
	double salary;
	Date doj;
	Vehicle veh;
	
	public Employee()
	{
		doj=new Date();
	}

	public Employee(int empid,String name,double salary,int day,int month,int year) {
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		this.doj=new Date(day,month,year);
		
	}
	
	public void acceptEmp(Scanner sc) {
		System.out.println("Enter ID :");
		this.empid=sc.nextInt();
		System.out.println("Enter Name");
		this.name=sc.next();
		System.out.println("Enter Salary:");
		this.salary=sc.nextDouble();
		System.out.println("Enter Date:");
		doj.acceptDate(sc);
		
	}
	
	public void addVehicle(Scanner sc) {
		veh=new Vehicle();
		veh.acceptVehicle(sc);
	}
	
	public void display() {
		System.out.println("ID:"+empid);
		System.out.println("Name:"+name);
		System.out.println("Salary"+salary);
		System.out.println("Date:");
		doj.displayDate();
		if(veh!=null) 
			veh.displayVehicle();
		System.out.println("");
	}
}
