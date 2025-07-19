package com.sunbeam;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e; // only reference of abstract class is allowed
		// e = new Employee(); // NOT OK -> Object of abstract class is not allowed
		// e = new Manager(); // upcasting
		e = new Salesman(); // upcasting
		e.accept(sc);
		e.display();
		e.calculateTotalSalary();
	}

}
