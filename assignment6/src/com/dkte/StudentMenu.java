package com.dkte;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;
import java.util.Scanner;

public class StudentMenu {
	
	
	public static int menu(Scanner sc) {
		
		System.out.println("0.Exit");
		System.out.println("1.Add Student::");
		System.out.println("2.Display all Students::");
		System.out.println("3.Search student by roll no.::");
		System.out.println("4.Sortt student on roll no::");
		System.out.println("5.Sort student on name::");
		System.out.println("6.Sort student on marks::");
		System.out.println("Enter your Choice:::");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 List<Student> l1=new ArrayList<>();
		 Student st=new Student();
		
		 int choice;
		 
		 while ((choice = menu(sc)) != 0) {
			 switch(choice) {
			 case 0:
				 System.out.println("Exiting");
				 break;
			 case 1:
				 
					l1.add(st.accept(sc));		 
				 break;
			 case 2:
				 l1.forEach(ss->System.out.println(ss));
				 
				 break;
				 
			 case 3:
				 System.out.println("Enter roll no. to search::");
				 int r=sc.nextInt();
				 boolean found=false;
				 for (Student s : l1) {
					if(s!=null || st.getRoolno()==r) {
						System.out.println("Student found   :)");
						l1.toString();						
						found=true;
					}
				 }
					if(!found) {
						System.out.println("Student not Found...:(");
					
				}
				 
				 break;
			 case 4:
				 Collections.sort(l1);
				 l1.forEach(ss->System.out.println(ss));
				 break;
			 case 5:
				 l1.sort((o1,o2)-> o1.name.compareTo(o2.name));
				 l1.forEach(ss->System.out.println(ss));
				 
				 break;
			 case 6:
				 l1.sort((o1,o2)-> Double.compare(o1.marks, o2.marks));
				 l1.forEach(ss->System.out.println(ss));
				 break;
				 
				 default:
					 System.out.println("Invalid Choice :(");
					 break;
					 
			 }
			
		 }
		 sc.close();
	}

}
