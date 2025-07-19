package com.dkte;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Program02 {

	public static void main(String[] args) {
		Map<Integer,String> m1=new HashMap<>();
		m1.put(1,"Panu");
		m1.put(4,"Samu");
		m1.put(2,"Karan");
		m1.put(6,"Dipu");
		m1.put(3,"Panu");
		m1.put(5,"Swati");
		m1.put(7,"Sagar");
		//m1.put(null, "a");
		//m1.put(null, "b");
		//m1.put(9, null);
		m1.put(10, null);
		
		Set<Map.Entry<Integer,String>> keyValue=m1.entrySet();
		for (Map.Entry<Integer,String> e: keyValue) {
			System.out.println(e.getKey()+"-"+e.getValue());
		}

	}

}
