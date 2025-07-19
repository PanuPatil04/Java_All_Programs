package com.dkte;

import java.util.Arrays;

class Student implements Comparable<Student>{
	int roll;
	String name;
	int marks;
	
	public Student() {
		
	}

	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

	/*@Override
	public int compareTo(Student o) {
		return this.roll -o.roll;
	}*/
	
	/*public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}*/
	
	public int compareTo(Student o) {
		return this.marks -o.marks;
	}
	
}
public class ProgramS {

	public static void main(String[] args) {
		Student arr[]=new Student[3];
		arr[0]=new Student(3,"Karan",94);
		arr[1]=new Student(8,"Ayush",89);
		arr[2]=new Student(1,"Dipu",91);
		
		System.out.println("Before Sorting::");
		for(Student s:arr)
			System.out.println(s);
		
		Arrays.sort(arr);
		
		System.out.println("After Sorting::");
		for(Student s:arr)
			System.out.println(s);
			

	}

}
