package com.dkte;


class Box<T extends Number>{
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	
	
}
public class Program01 {

	public static void main(String[] args) {
		
		Box<Double>b2=new Box<Double>();
		b2.setObj(10.04);
		System.out.println(b2.getObj());
		/*
		  Box <String> b2=new Box<String>();
		b2.setObj("Panu");
		System.out.println(b2.getObj());
		*/
		
		Box <Integer> b1=new Box<Integer>();
		b1.setObj(4);
		System.out.println(b1.getObj());
		
		
		

	}

}
