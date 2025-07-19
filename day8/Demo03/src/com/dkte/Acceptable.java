package com.dkte;
import java.util.Scanner;

 interface Acceptable {
	void accept(Scanner sc);

}
 interface Displayable{
	 void display();
 }

 class Time implements Acceptable,Displayable{
	 int hr;
	 int min;
	 
	 public void accept(Scanner sc) {
		 System.out.println("accept::Time");
	 }
	 public void display() {
		 System.out.println("display::Time");
	 }
 }
 
 class Date implements Acceptable{
	 public void accept(Scanner sc) {
		 System.out.println("accept::Date");
	 }
 }

 class Employee implements Acceptable,Displayable{

		@Override
		public void accept(Scanner sc) {
		}

		@Override
		public void display() {
			
		}
		
	}
