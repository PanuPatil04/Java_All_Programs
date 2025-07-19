package com.dkte.array;

import java.util.Arrays;

class Employee1 implements Comparable<Employee1>{
	int id;
	String name;
	double sal;
	
	public Employee1() {
		
	}

	public Employee1(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

/*	@Override
	public int compareTo(Employee1 o) {
		//return this.id - o.id;
		return o.id - this.id;
	}*/
	
/*	public int compareTo(Employee1 o) {
		
		return Double.compare(this.sal,o.sal);
	
	}*/
	
		public int compareTo(Employee1 o) {
				
				return this.name.compareTo(o.name);
			
			}
	
	
}
public class Pro3 {

	public static void main(String[] args) {
		Employee1[] arr=new Employee1[5];
		arr[0]=new Employee1(1,"Panu",90000);
		arr[1]=new Employee1(2,"Swati",20000);
		arr[2]=new Employee1(3,"Megha",70000);
		arr[3]=new Employee1(4,"Samu",40000);
		arr[4]=new Employee1(5,"Dipali",60000);
		
		System.out.println("Before Sorting::");
		for(Employee1 e:arr)
			System.out.println(e);
		
		Arrays.sort(arr);
		
		System.out.println("After Sorting::");
		for(Employee1 e:arr)
			System.out.println(e);
			

	}

}
