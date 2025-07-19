package com.dkte;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee e1=new Employee();
		e1.display();
		
		Employee e3=new Employee(1,"anil",100000,1,1,2005);
		e3.display();
		
		Employee e2=new Employee();
		e2.acceptEmp(sc);
		e2.addVehicle(sc);
		e2.display();
		
		
		
	}

}
