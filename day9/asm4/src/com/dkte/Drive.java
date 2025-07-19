package com.dkte;

import java.util.Scanner;

public class Drive {
	double totalMiles;
	double costPerGallon;
	double avgPerGallon;
	double parkingFees;
	double tolls;
	
	public Drive() {
		
	}
	
	
	public Drive(double totalMiles, double costPerGallon, double avgPerGallon, double parkingFees, double tolls,
			double calc) {
		super();
		this.totalMiles = totalMiles;
		this.costPerGallon = costPerGallon;
		this.avgPerGallon = avgPerGallon;
		this.parkingFees = parkingFees;
		this.tolls = tolls;
		this.calc = calc;
	}
	
	

	public void accept(Scanner sc) {
		System.out.println("Enter total miles you drive :");
		this.totalMiles=sc.nextDouble();
		System.out.println("Enter cost per gallon of gasoline:");
		this.costPerGallon=sc.nextDouble();
		
		System.out.println(" Average miles per Gallon:");
		this.avgPerGallon=sc.nextDouble();
		System.out.println("Enter parking fees per day:");
		this.parkingFees=sc.nextDouble();
		System.out.println("Enter the no. of Tolls per day:");
		this.tolls=sc.nextDouble();
	}
	
	public void display() {
		System.out.println("Total miles driven per day: "+totalMiles);
		System.out.println(" Cost per gallon of gasoline:"+costPerGallon);
		System.out.println("Average miles per gallon : "+avgPerGallon);
		System.out.println(" Parking fees per day: "+parkingFees);
		System.out.println("Tolls per day:"+tolls);
	}
	double calc;
	
	public void cal() {
		calc=(parkingFees+tolls+(totalMiles/avgPerGallon)*costPerGallon);
		System.out.println("User cost per day:"+calc);
	}

}
