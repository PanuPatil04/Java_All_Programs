package com.dkte;
import java.util.Scanner;
public class Vehicle {
	String name;
	String no;
	
	public Vehicle()
	{
		
	}
	
	public Vehicle(String name,String no) {
		this.name=name;
		this.no=no;
	}
	
	public void acceptVehicle(Scanner sc) {
		System.out.println("Enter Vehicle Name:");
		this.name=sc.next();
		System.out.println("Enter Vehicle No.:");
		this.no=sc.next();
		
	}
	
	public void displayVehicle() {
		System.out.println(" Vehicle Name:"+name);
		System.out.println(" Vehicle Number:"+no);
	}

}
