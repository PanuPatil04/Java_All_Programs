package com.dkte;

import java.util.Scanner;

public class Program01 {

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
			
		}catch(ArithmeticException e) {
			System.out.println("Cant divide by zero");
		}
		
		sc.close();

	}

}
