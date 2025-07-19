package com.dkte;
import java.util.Scanner;
public class Manager extends Employee {
	int bonus;
	
	public Manager() {
		System.out.println("Manager()");
	}
	
	public Manager(int bonus) {
		this.bonus=bonus;
	}
	
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter bonus:");
		this.bonus=sc.nextInt();
	}
	
	public void display() {
		super.display();
		System.out.println("Bonus:"+bonus);
	}

}
