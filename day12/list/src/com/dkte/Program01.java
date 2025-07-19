package com.dkte;

import java.util.ArrayList;
import java.util.List;

public class Program01 {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<>();
		l1.add("Panu");
		l1.add("Samu");
		l1.add("Prajuu");
		l1.add("Megha");
		l1.add("Samu");
		l1.add("Dipu");
		l1.add("Chinu");
		l1.add("Samu");
		
		for (String e : l1) {
			System.out.println(e);
		}
		
		System.out.println("index of Prajuu::"+l1.indexOf("Prajuu"));
		System.out.println("Who is at index 3::"+l1.get(3));
		
		l1.remove(2);
		l1.remove("Panu");
		
		for (String e : l1) {
			System.out.println(e);
		
		
		}
		l1.set(0, "Panu");
		
		for (String e : l1) {
			System.out.println(e);
		
		
		}
		System.out.println("Index of Samu::"+l1.indexOf("Samu"));
		System.out.println("Last index of Samu::"+l1.lastIndexOf("Samu"));
		

	}

}
