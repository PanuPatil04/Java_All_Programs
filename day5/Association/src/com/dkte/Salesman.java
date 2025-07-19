package com.dkte;
import java.util.Scanner;
public class Salesman extends Employee{
	int commission;
	
	public Salesman() {
		System.out.println("Salesman()");
	}
	
	public Salesman(int commission) {
		this.commission=commission;
		}
	
	public void accept(Scanner sc) {
		System.out.println("Enter Commission");
		this.commission=sc.nextInt();
	}
	
	public void display() {
		System.out.println("Commission:"+commission);
	}

}
