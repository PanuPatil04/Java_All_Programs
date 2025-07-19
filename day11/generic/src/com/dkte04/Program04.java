package com.dkte04;

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


public class Program04 {
	//lower bound -> super.....
	public static void displayBox(Box<? super Integer> b) {
		System.out.println("Value::"+b.getObj());
	}
	
	public static void main(String args[]) {
	
	Box<Integer> b1=new Box<Integer>(10);
	displayBox(b1);
	Box<Double> b2 = new Box<Double>(11.22);
	// displayBox(b2); // NOT OK
	Box<String> b3 = new Box<String>("sunbeam");
	// displayBox(b3); // NOT OK
	Box<Date> b4 = new Box<Date>(new Date());
	// displayBox(b4); // NOT OK

	
	}
}

