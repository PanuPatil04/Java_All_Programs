package com.sunbeam;
import java.util.Scanner;
public class Program03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Student[][] studentList = new Student[2][];
		// cs branch
		studentList[0] = new Student[2];
		for (int i = 0; i < studentList[0].length; i++) {
            studentList[0][i] = new Student();
            System.out.println("Enter details for CS student " + (i + 1) + ":");
            studentList[0][i].acceptStudent(sc);
        }
		
		System.out.println("-------------------------------------------------------------------------------------------------");
		sc.nextLine();

		
		// ai-ds
		studentList[1] = new Student[1];
		for (int i = 0; i < studentList[1].length; i++) {
            studentList[1][i] = new Student();
            System.out.println("Enter details for DS student " + (i + 1) + ":");
            studentList[1][i].acceptStudent(sc);
        }
		System.out.println("-------------------------------------------------------------------------------------------------");
		sc.nextLine();

		// To-Do
		
		 System.out.println("\n--- Student Details ---");
	        String[] branches = {"CS", "AI-DS"};
	        for (int i = 0; i < studentList.length; i++) {
	            System.out.println("Branch: " + branches[i]);
	            for (Student student : studentList[i]) {
	                student.displayStudent();
	            }
	        }

	        sc.close();

		           
	}

}
