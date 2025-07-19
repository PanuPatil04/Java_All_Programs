package com.dkte;
import java.util.Scanner;
public class Menu {
	private String name;
	private int price;
	
	public Menu() {
		
	}
	
	public Menu(String name, int price) {
		
		this.name = name;
		this.price = price;
		
	}
	
	public void accept(Scanner sc) {
		System.out.println("Enter name of Menu:");
		this.name=sc.next();
		System.out.println("Enter price of Menu");
		this.price=sc.nextInt();
	
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
	public void display() {
		System.out.println("Menu Name:"+name);
		System.out.println("Menu Price:"+price);
		
		
	}
	
	
	

}
