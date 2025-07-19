package com.dkte;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int d;
		
		try {
			System.out.println("Enter numerator:");
			n=sc.nextInt();
			System.out.println("Enter denominator:");
			d=sc.nextInt();
			int result=n/d;
			System.out.println("Result="+result);
			
		}catch(ArithmeticException ex) {
			System.out.println("Cant divide by zero :(");
		}catch(InputMismatchException e) {
			System.out.println("Give correct Input !!!!!!!!!!!!");
		}
		
		sc.close();
	}

}
