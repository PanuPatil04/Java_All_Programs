package com.dkte.generic;

import java.util.StringTokenizer;

public class Program02 {

	public static void main(String[] args) {
		String s="www.dkte.in/place@ments";
		System.out.println("Name"+s);
		
		//StringTokenizer stk=new StringTokenizer(s,"./@");
		
		StringTokenizer stk=new StringTokenizer(s,"./@",true);
		while(stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}


	}

}
