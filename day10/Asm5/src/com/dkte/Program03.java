package com.dkte;

public class Program03 {

	public static void main(String[] args) {
		String s1="level";
		String rev="";
		
		for(int i=s1.length()-1;i>=0;i--) {
			rev +=s1.charAt(i);
			
		}
	
		
	if(s1.equals(rev)) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("not Palindrome");
	}

	}

}
