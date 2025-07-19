package com.dkte;

public class Program01 {

	public static void main(String[] args) {
		String s1[]= {"Pranali","Patil","Panu"};
		String s2[]= {"Panu","Patil","Google"};
		
		for(int i=0; i<s1.length;i++) {
			for(int j=0; j<s2.length;j++) {
				if(s1[i].equals(s2[j])) {
					System.out.println(s1[i]);
					
				}
			}
		}
		

	}

}
