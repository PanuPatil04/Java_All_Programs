package com.dkte;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Drive d=new Drive();
		d.accept(sc);
		d.display();
		d.cal();

	}

}
