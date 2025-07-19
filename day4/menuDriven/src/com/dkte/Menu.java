package com.dkte;

import java.util.Scanner;
public class Menu {
	
	public static int menu(Scanner sc) {
		System.out.println("----------------------------------");
		System.out.println("1.Add");
		System.out.println("2.Display");
		System.out.println("3.Find");
		System.out.println("4.Exit");
		System.out.println("Enter your choice:");
		
		
		
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Student s[]=new Student[5];
		Scanner sc=new Scanner(System.in);
		int index=0;
		int choice;
		
		while((choice=menu(sc))!=0) {
			switch(choice) {
			
			case 1:
				if (index < 5) {
					 s[index] = new Student();
					s[index].acceptStudent(sc);
					index++;
				} else
					System.out.println("Course is full");
				break;
           case 2:
        	   for(Student e: s)
        		   if(e!=null)
				      e.displayStudent();
				
				break;
           case 3:
        	    System.out.print("Enter roll no. to search: ");
				int roll = sc.nextInt();
				boolean found = false;
				for (Student e : s) {
					if (e != null && e.rollno == roll) {
						System.out.println("Student found:");
						e.displayStudent();
						found = true;
					}
					
					}
				if(!found) {
					System.out.println("Student not found :(");
				}
					
				break;
				
           case 4:
				system.out.println("EXITING........")
				break;
           default:
				System.out.println("You had entered wrong Choice :(");
				
				break;
				
			
			}
		}
		

	}

}
