package com.dkte;

//import java.util.LinkedHashSet;
//import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program01 {
	public static void main(String[] args) {
	//	Set<Integer> s1=new HashSet<>();
		Set<Integer> s1=new TreeSet<>();
	//	Set<Integer> s1=new LinkedHashSet<>();
		s1.add(23);
		s1.add(34);
		s1.add(89);
		s1.add(44);
		s1.add(44);
		
		//s1.add(null);
		
		System.out.println("size"+s1.size());
		
		for (Integer i : s1) {
			System.out.println(i);
			
			
		}

	}

}
