package com.dkte.test;

import java.util.Scanner;

class LabException extends RuntimeException{
	public LabException() {
		
	}
	
	public LabException(String message) {
		super(message);
	}
}
public class LabStaff extends Staff {
   
    private double salary;

    @Override
    public void accept(Scanner sc) {
        super.accept(sc);
        System.out.print("Enter Salary: ");
        double sal = sc.nextDouble();
        if(salary<=0 ) 
        	throw new LabException("Enter Salary greater than 0");
        this.salary = sal;
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
