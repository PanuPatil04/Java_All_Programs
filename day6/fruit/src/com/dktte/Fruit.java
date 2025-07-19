//Q1 Apply inheritance n polymorphism 
//a) Arrange Fruit,Apple,Orange,Mango in inheritance hierarchy 
//b) Properties (instance variables)  : color : String , weight : double , name:String, isFresh : boolean 
//c) Add suitable constructors. 
//d) Override  toString correctly to return state of all fruits (including : name ,color , weight ) 
//e) Add a taste() method : public String taste() 
package com.dktte;
import java.util.Scanner;
public class Fruit {
	String color;
	double weight;
	String name;
	boolean isFresh;
	
	public Fruit() {
		
	}

	public Fruit(String color, double weight, String name, boolean isFresh) {
		
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = true;
	}
	
	public String getName() {
		return name;
	}
	
	public String taste() {
		return "No specific Taste";
		
	}
	
	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}
	
	
	public void accept(Scanner sc) {
		System.out.println("Enter Color of Fruit:");
		this.color=sc.next();
		System.out.println("Enter weight:");
		this.weight=sc.nextDouble();
		System.out.println("Enter Name:");
		this.name=sc.next();
		System.out.println("Is Fruit Fresh(True/False):");
		this.isFresh=sc.nextBoolean();
	}
	
	public void display() {
		System.out.println("Color :"+color);
		System.out.println("Weight:"+weight);
		System.out.println("Name"+name);
		System.out.println("Is Fresh"+isFresh);
	}

}
