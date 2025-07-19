package com.dkte;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class Employee implements Comparable<Employee>{
	int id;
	String name;
	double salary;
	
	public Employee() {
		
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.id-o.id;
	}
	
	
}
public class Program01 {
	
	private static int choice;

	public static void display(Employee arr[]) {
		for (Employee e : arr) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee[] arr=new Employee[5];
		arr[0]=new Employee(1,"Panu",90000);
		arr[1]=new Employee(2,"Swati",60000);
		arr[2]=new Employee(3,"Annu",20000);
		arr[3]=new Employee(4,"Tanu",50000);
		arr[4]=new Employee(5,"Jiya",10000);
		
		System.out.println("Before Sorting::");
		display(arr);
		
		class EmpNameComparator implements Comparator<Employee>{

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.name.compareTo(o2.name);
			}
		}
			EmpNameComparator enc=new EmpNameComparator();
			
			class EmpSalComparator implements Comparator<Employee>{

				@Override
				public int compare(Employee o1, Employee o2) {
					
					return Double.compare(o1.salary, o2.salary);
				}
			}
				EmpSalComparator esc=new EmpSalComparator();
		do {
		
		System.out.println("1. Sort n display Employees on Empid");
		System.out.println("2. Sort n display Employees on Name");
		System.out.println("3. Sort n display Employees on Salary in Desc");
		System.out.println("Enter your choice -");
		choice = sc.nextInt();
		
		
				
				switch(choice) {
				case 0:
					System.out.println("Exiting........");
					break;
				case 1:
					Arrays.sort(arr);
					display(arr);
					break;
				case 2:
					Arrays.sort(arr,enc);
					display(arr);
					break;
				case 3:
					Arrays.sort(arr,esc);
					display(arr);
					break;
				}
				
		}while(choice!=0);
		
		sc.close();
		}
		
        
	}


