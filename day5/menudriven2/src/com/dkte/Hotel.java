package com.dkte;
import java.util.Scanner;
public class Hotel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Menu m=new Menu();
		m.accept(sc);
		
		m.display();

	}

}
