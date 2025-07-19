package com.dkte2;

class Person implements Cloneable{
	String name;
	String city;
	public Person() {
		System.out.println("Inside Person(String,String)");
	}
	public Person(String name, String city) {
		
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}
public class Program03 {

	public static void main(String[] args) {
		
		try {
			Person p1=new Person("Panu","Pune");
			Person p2=(Person) p1.clone();
			System.out.println("P1"+p1);
			System.out.println("P2"+p2);
			p2.name="Pranali";			
			System.out.println("P1"+p1);
			System.out.println("P2"+p2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
