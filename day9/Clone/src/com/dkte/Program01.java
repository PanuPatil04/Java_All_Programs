package com.dkte;


class Person{
	String name;
	String city;
	
	public Person(){
		
	}

	public Person(String name, String city) {
	    System.out.println("Inside Person(String,String)");
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
	
	
}
public class Program01 {

	public static void main(String[] args) {
		Person p1=new Person("Panu","Pune");
		Person p2=p1;
		System.out.println("P1"+p1);
		System.out.println("P2"+p2);
		p2.name="Pranali";
		
		
		
		System.out.println("P1"+p1);
		System.out.println("P2"+p2);

	}

}
