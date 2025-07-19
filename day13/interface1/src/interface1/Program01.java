package interface1;

import java.util.List;
import java.util.Scanner;

interface Acceptable {
	void accept(Scanner sc);

	default void display() {
		System.out.println("Acceptable::display");
	}

	static <T> void sort(List<T> l1) {
		System.out.println("Sorting logic");
	}

}

//interface Displayable {
//	void display();
//}

class Employee implements Acceptable {
	@Override
	public void accept(Scanner sc) {
		System.out.println("Employee Accept");
	}

	@Override
	public void display() {
		System.out.println("Employee::display");
	}
}

class Date implements Acceptable {
	@Override
	public void accept(Scanner sc) {
		System.out.println("Date Accept");
	}
}

class Time implements Acceptable {
	@Override
	public void accept(Scanner sc) {
		System.out.println("Time Accept");
	}

	@Override
	public void display() {
		System.out.println("Time::display");
	}
}

public class Program01 {

	public static void main(String[] args) {
//		Acceptable a = new Employee();
//		Acceptable a = new Time();
		Acceptable a = new Date();
		a.accept(null);
		a.display();
	}

}
