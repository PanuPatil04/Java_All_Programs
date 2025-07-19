package com.dkte;

public class Program01 {
	public static void main(String args[]) {
		
		Acceptable a1;
		a1=new Date();
		a1=new Time();
		a1.accept(null);
		
		Time t1=(Time) a1;
		t1.display();
		
	}
	

}
