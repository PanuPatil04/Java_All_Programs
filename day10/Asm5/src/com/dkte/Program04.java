package com.dkte;

public class Program04 {

	public static void main(String[] args) {
		
		StringBuilder s1=new StringBuilder("top");
		StringBuilder s2=new StringBuilder(s1).reverse();
		
		System.out.println("Reversed String:"+s2);
		
		if(s1.toString().equals(s2.toString())) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not Palindrome");
		}

	}

}
