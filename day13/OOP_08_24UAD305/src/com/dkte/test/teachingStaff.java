package com.dkte.test;

import java.util.Scanner;

class StaffException extends RuntimeException{
	public StaffException() {
		
	}
	public StaffException(String s) {
			super(s);
		}
	
	
}
public class teachingStaff extends Staff {
    private int noofhours;
    private int hours;

    @Override
    public void accept(Scanner sc) {
        super.accept(sc);
        System.out.print("Enter Number of hours: ");
        int noh = sc.nextInt();
        if(noh<=0)
        	throw new StaffException("Enter no. of hours above 0");
        	this.noofhours=noh;
        
        System.out.print("Enter Working Hours: ");
       int hrs = sc.nextInt();
       if(hrs<=0)
       	throw new StaffException("Enter charges per hours above 0");
       	this.hours=hrs;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Number of hours: " + noofhours);
        System.out.println("Hours: " + hours);
    }

    public int getHours() {
        return hours;
    }
}
