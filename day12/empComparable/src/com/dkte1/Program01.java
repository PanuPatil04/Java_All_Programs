package com.dkte1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program01 {

	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<>();
		
		c1.add(21);
		c1.add(22);
		c1.add(44);
		c1.add(45);
		c1.add(9);
		
		System.out.println(c1);
		
		c1.remove(9);
		
		System.out.println(c1);
		
		System.out.println("c1 size::"+c1.size());
		System.out.println("contains 50 ?::"+c1.contains(50));
		System.out.println("contains 44::"+c1.contains(44));
		System.out.println(c1);
		
		for(Integer i:c1) {
			System.out.println("Number::"+ i);
		}
		
		Iterator<Integer> itr=c1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
