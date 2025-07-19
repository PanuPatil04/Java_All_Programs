package com.dkte;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Program01 {

	public static void main(String[] args) {
		Map<Integer,String> m1=new HashMap<>();
		m1.put(1,"Panu");
		m1.put(2,"Samu");
		m1.put(3,"Karan");
		m1.put(4,"Dipu");
		m1.put(5,"Panu");
		m1.put(6,"Swati");
		m1.put(7,"Sagar");
		//m1.put(null, "a");
		//m1.put(null, "b");
		//m1.put(9, null);
		//m1.put(10, null);
		
		System.out.println("size::"+m1.size());
		Set<Integer> k=m1.keySet();
		for (Integer i : k) {
			System.out.println(i+",");
		}
		Collection<String> s=m1.values();
		for (String string : s) {
			System.out.println(string);
		}
	}

}
