package com.sunbeam;

import java.util.Scanner;

public class Salesman extends Employee {
	int noOfProducts;
	double commission;

	public Salesman() {
	}

	public Salesman(int empid, double salary, int noOfProducts, double commission) {
		super(empid, salary);
		this.noOfProducts = noOfProducts;
		this.commission = commission;
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter the no of products sold - ");
		noOfProducts = sc.nextInt();
		System.out.print("Enter the commision per product - ");
		commission = sc.nextDouble();

	}

	@Override
	public void display() {
		super.display();
		System.out.println("No of products sold - " + noOfProducts);
		System.out.println("Commission per product - " + commission);
	}

	@Override
	public void calculateTotalSalary() {
		System.out.println("Total Salary - " + (salary + (noOfProducts * commission)));

	}

}
