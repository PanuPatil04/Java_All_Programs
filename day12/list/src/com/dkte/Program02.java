package com.dkte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program02 {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<>();
		l1.add("Panu");
		l1.add("Samu");
		l1.add("Prajuu");
		l1.add("Megha");
		l1.add("Kirti");
		l1.add("Dipu");
		l1.add("Chinu");
		l1.add("Aaru");
		
		System.out.println("Before Sorting");
		for (String s: l1) {
			System.out.println(s);
		}
		
		Collections.sort(l1);
		
		System.out.println("After Sorting");
		for (String s: l1) {
			System.out.println(s);
		}

	}

}
