package com.dkte1;

import java.util.ArrayList;
import java.util.Collection;

class Employee{
	
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
	
	

	public Employee(int id) {
		this.id = id;
		
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (obj instanceof Employee) {
			Employee e = (Employee) obj;
			if (this.id == e.id)
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
public class Program02 {

	public static void main(String[] args) {
		Collection<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(1,"Panu",90000));
		emp.add(new Employee(2,"Tanu",50000));
		emp.add(new Employee(3,"Sanuu",60000));
		emp.add(new Employee(4,"Akhil",20000));
		
		emp.contains(new Employee(1));
		emp.remove(new Employee(1));
		
		System.out.println("size::"+ emp.size());
		
		System.out.println("Contains 3::"+emp.contains(new Employee(3)));
		
		
		for (Employee employee : emp) {		
			System.out.println(employee);
			
		}

	}

}
