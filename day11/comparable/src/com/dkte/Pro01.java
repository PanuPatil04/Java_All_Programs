package com.dkte;


class Employee implements Comparable<Employee>{
	int id;
	String name;
	int sal;
	
	public Employee() {
		
	}
	public Employee(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	//@Override
	/*public int compareTo(Employee o) {
		
		return this.id-o.id;
	}*/
	
	@Override
	public int compareTo(Employee o) {
		if (this.id > o.id)
		return 5;
		if (this.id < o.id)
			return -3;
		return 0;
	}

	
	//	public int compareTo(Employee o) {
		//		
			//	return this.sal-o.sal;
			//}
	
	
	
	
}
public class Pro01 {

	public static void main(String[] args) {
		Employee e1 = new Employee(3, "Anil", 15000);
		Employee e2 = new Employee(2, "Mukesh", 20000);
		
		if(e1.compareTo(e2)>0)
			System.out.println("E1 is greater");
		else if(e1.compareTo(e2)<0)
			System.out.println("E2 is greater");
		else
			System.out.println("Both are equal");

	}

}
