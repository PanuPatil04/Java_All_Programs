package com.dkte2;

import java.util.Date;

class Box<T> {
	private T obj;
	
	

	public Box(T obj) {
		
		this.obj = obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}
}

public class Program02 {
	
	public static void displayBox(Box<?> b) {
		System.out.println("Value::"+b.getObj());
	}
	
	public static void main(String args[]) {
	
	Box<Integer> b1=new Box<Integer>(10);
	displayBox(b1);
	Box<Double> b2=new Box<Double>(11.2);
	displayBox(b2);
	Box<String> b3=new Box<String>("Panu");
	displayBox(b3);
	Box<Date> b4=new Box<Date>(new Date());
	displayBox(b4);
	
	
	}
}
