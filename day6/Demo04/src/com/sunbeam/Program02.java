package com.sunbeam;

import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[] arr = new Employee[5];
		arr[0] = new Manager();
		arr[1] = new Salesman();
		arr[2] = new Manager();
		arr[3] = new Manager();
		arr[4] = new Salesman();
	}

}