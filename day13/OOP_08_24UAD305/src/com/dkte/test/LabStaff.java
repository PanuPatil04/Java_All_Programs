package com.dkte.test;

import java.util.Scanner;

class StaffException extends RuntimeException{
	public StaffException(){
		
	}
	
	public StaffException(String s) {
			super(s);
		}
}

public class LabStaff extends Staff {
   
    private double salary;

    @Override
    public void accept(Scanner sc) {
        super.accept(sc);
        System.out.print("Enter Salary: ");
        double sal = sc.nextDouble();
        if(sal<=0)
        	throw new StaffException("Enter salary above 0");
        	this.salary=sal;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Salary: " + salary);
    }

    public double getSalary() {
        return salary;
    }
}
