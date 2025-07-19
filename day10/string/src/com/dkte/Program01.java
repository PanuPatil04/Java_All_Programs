package com.dkte;

public class Program01 {

	public static void main(String[] args) {
		String s1=new String("Panuu");
		String s2="Panuu";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("s1==s2"+s1==s2);
		System.out.println("s1.Equals(s2)"+s1.equals(s2));
		
		s2="Pranaliii";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("s1==s2"+s1==s2);
		System.out.println("s1.isEqual(s2)"+s1.equals(s2));
		

	}

}
