package com.dkte;

public class Program02 {

	public static void main(String[] args) {
		Student[] arr = new Student[5];
		arr[0] = new Student(1, "Anil", 50);
		arr[1] = new Student(2, "Mukesh", 55);
		arr[2] = new Student(3, "Ramesh", 60);
		arr[3] = new Student(4, "Suresh", 65);
		arr[4] = new Student(5, "Ram", 70);

		for (int i = 0; i < arr.length; i++) {
			arr[i].displayStudent();
			System.out.println("-------------------------");
		}

		System.out.println("Using For-each ->");

		for (Student s : arr) {
			s.displayStudent();
			System.out.println("-------------------------");
		}

	}

}
