package com.dkte;

public class Program05 {

	public static void main(String[] args) {
	String s1="sunbeam";
	String s2="SUNBEAM";
	String s3=s1.toUpperCase();
	String s4=s3;
	
	System.out.println("s1 - " + s1);
	System.out.println("s2 - " + s2);
	System.out.println("s1 == s2 - " + (s1 == s2)); // false
	System.out.println("s2 == s3 - " + (s2 == s3)); // false
	System.out.println("s1 == s3 - " + (s1 == s3)); // false
	System.out.println("s3 == s4 - " + (s3 == s4)); //true

	}

}
