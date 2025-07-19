package com.dkte;
import java.util.Scanner;
public class Salesman extends Employee{
	int commission;
	int no_Of_Prod;
	
	public Salesman() {
		System.out.println("Salesman()");
	}
	
	public Salesman(int commission) {
		this.commission=commission;
		this.no_Of_Prod=no_Of_Prod;
		}
	
	public void accept(Scanner sc) {
		System.out.println("Enter Commission:");
		this.commission=sc.nextInt();
		System.out.println("Enter Number of products:");
		this.no_Of_Prod=sc.nextInt();
	}
	
	public void display() {
		System.out.println("Commission:"+commission);
		
	}
	
	public void calTotalCommission() {
		System.out.println("Total Commission:"+(commission*no_Of_Prod));
	}

}
