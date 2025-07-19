package com.dkte;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Manager m=new Manager();
		Salesman s=new Salesman();
		m.accept(sc);
		s.accept(sc);
		m.display();
		s.display();
	}

}
