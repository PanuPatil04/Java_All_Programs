package com.dkte;

import java.util.Scanner;

class Student {
	int rollno;
	String name;
	double marks;
	

	public Student() {
	}

	public Student(int rollno, String name, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	
	// To-Do -> acceptStudent(Scanner sc)
	public void acceptStudent(Scanner sc) {
		// TO-DO
		System.out.println("Enter Roll No. :");
		this.rollno=sc.nextInt();
		System.out.println("Enter Name  :"+name);
		this.name=sc.next();
		System.out.println("Enter Marks  :"+marks);
		this.marks=sc.nextDouble();
	}
	

	public void displayStudent() {
		System.out.println("Rollno - " + rollno);
		System.out.println("Name - " + name);
		System.out.println("Marks - " + marks);
	}

}

