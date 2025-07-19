package com.dkte;

class Outer {
	int f3;
	static int f4;
	class Inner{
		int f1;
		
		void innerMethod() {
			//int a;
			
			System.out.println(f3);
			System.out.println(f4);
			System.out.println(f1);
			
			
			
		}
	}
}
public class Program01 {

	public static void main(String[] args) {
	      Outer out=new Outer();
	      Outer.Inner in=out.new Inner();

	}

}
