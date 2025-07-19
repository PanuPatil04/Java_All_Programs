package com.dkte;

import java.util.Scanner;

public class Student implements Comparable<Student> {
	int roolno;
	String name;
	double marks;
	public Student() {
		
	}
	public Student(int roolno, String name, double marks) {
		this.roolno = roolno;
		this.name = name;
		this.marks = marks;
	}
	
	public Student accept(Scanner sc) {
		System.out.println("Enter roll no.:: ");
		roolno=sc.nextInt();
		System.out.println("Enter name:: ");
		name=sc.next();
		System.out.println("Enter marks ");
		marks=sc.nextDouble();
		Student s1=new Student(roolno,name,marks);
		return s1;
	}
	@Override
	public String toString() {
		return "Student [roolno=" + roolno + ", name=" + name + ", marks=" + marks + "]";
	}
	public String getName() {
		return name;
	}
	public double getMarks() {
		return marks;
	}
	public int getRoolno() {
		return roolno;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.roolno-o.roolno;
	}
	

}
