package com.dkte;
import java.util.Scanner;
public class Person {
	String name;
	Date dob;
	
	public Person() {
		dob=new Date();
	}
	
	public void acceptP(Scanner sc) {
		System.out.println("Enter name:");
		name=sc.next();
		System.out.println("Enter Date of Birth");
		dob.acceptDate(sc);
	}
	
	public void displayP() {
		System.out.println("Name:"+name);
		dob.toString();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	

}
