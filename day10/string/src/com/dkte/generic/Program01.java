package com.dkte.generic;

import java.util.StringTokenizer;

public class Program01 {

	public static void main(String[] args) {
		String s="Pranali Patil";
		System.out.println("Name"+s);
		
		StringTokenizer stk=new StringTokenizer(s);
		while(stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
			
		}

	}

}
