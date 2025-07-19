package com.dktte;
import java.util.Scanner;
public class Apple extends Fruit {
	Scanner sc=new Scanner(System.in);
	
	public Apple() {
		super();
	}
	//public Apple(String color, double weight, String name, boolean isFresh) {
		//super(color,weight,name,isFresh);
	//}
	
	
	
	public String taste() {
		return "Sweet n Sour";
	}

}
