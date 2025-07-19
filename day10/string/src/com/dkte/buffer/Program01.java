package com.dkte.buffer;

public class Program01 {

	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder("Panu");
		s1.append("Patil");
		
		StringBuffer s2=new StringBuffer("Panu");
		s2.append("Patil");
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
