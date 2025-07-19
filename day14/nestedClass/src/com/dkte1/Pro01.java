package com.dkte1;

class Outer{
	int f1;
	static int f2;
	
	static class Inner{
		int f3;
		static int f4;
		
		 void innerMethod1() {
		//	System.out.println(f1); //Non-static field not allowed
			 Outer o=new Outer();
			 System.out.println(o.f1);
			System.out.println(f2);
			System.out.println(f3);
			System.out.println(f4);
			
		}
		 static void innerMethod2(){
			  //System.out.println(f1);//non-static field of outer class is not allowed
			 Outer o1=new Outer();
			 System.out.println(o1.f1);
				System.out.println(f2);
				//System.out.println(f3);//non-static field of inner class is not allowed
				System.out.println(f4);
				
		 }
	}
}
public class Pro01 {
public void main(String args[]) {
	Outer.Inner in=new Outer.Inner();
}
}
