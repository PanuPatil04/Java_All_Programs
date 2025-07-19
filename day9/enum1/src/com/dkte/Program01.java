package com.dkte;

import java.util.Scanner;

enum ArithmeticOperation {
	EXIT, ADDITION, SUBSTRACTION, MULTIPLICATION, DIVISION, SQUARE, SQUREROOT
}

public class Program01 {
	public static ArithmeticOperation menu(Scanner sc) {
		ArithmeticOperation arr[] = ArithmeticOperation.values();
		for (ArithmeticOperation e : arr)
			System.out.println(e.ordinal() + ". " + e.name());

		System.out.print("Enter your choice - ");
		int choiceIndex = sc.nextInt();
		if (choiceIndex < 0 || choiceIndex >= arr.length) {
			System.out.println("Invalid choice. Try again.");
			return menu(sc); 
		}
		return arr[choiceIndex];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArithmeticOperation choice;

		do {
			choice = menu(sc);

			if (choice == ArithmeticOperation.EXIT) {
				System.out.println("Exiting !!!");
				break;
			}

			System.out.print("Enter num1: ");
			int n1 = sc.nextInt();

			System.out.print("Enter num2: ");
			int n2 = sc.nextInt();

			switch (choice) {
				case ADDITION:
					System.out.println("Addition: " + (n1 + n2));
					break;
				case SUBSTRACTION:
					System.out.println("Subtraction: " + (n1 - n2));
					break;
				case MULTIPLICATION:
					System.out.println("Multiplication: " + (n1 * n2));
					break;
				case DIVISION:
					if (n2 != 0)
						System.out.println("Division: " + (n1 / n2));
					else
						System.out.println("Cannot divide by zero.");
					break;
				case SQUARE:
					System.out.println("n1 square: " + (n1 * n1));
					System.out.println("n2 square: " + (n2 * n2));
					break;
				case SQUREROOT:
					System.out.println("n1 squareroot: " + Math.sqrt(n1));
					System.out.println("n2 squareroot: " + Math.sqrt(n2));
					break;
				default:
					System.out.println("Invalid operation.");
			}

			System.out.println(); 
		} while (true);

		sc.close();
	}
}
