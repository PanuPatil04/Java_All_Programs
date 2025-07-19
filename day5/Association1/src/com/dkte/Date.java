package com.dkte;
import java.util.Scanner;

public class Date {
	int day;
	int month;
	int year;
	
	public Date() {
		
	}
	public Date(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
		
	}
	
	public void acceptDate(Scanner sc) {
		System.out.println("Enter Day:");
		this.day=sc.nextInt();
		System.out.println("Enter Month:");
		this.month=sc.nextInt();
		System.out.println("Enter Year:");
		this.year=sc.nextInt();		
	}
	
	public void displayDate() {
		System.out.println(day + "/" + month + "/" + year);
	}

}
