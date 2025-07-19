package com.dkte3;

import java.util.Arrays;
import java.util.Comparator;

public class Pro02 {
	public static void main(String args[]) {
		
		//Anonyms class
		Comparator<Integer> c=new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o2-o1;
			}
			
		};
		
		
		Integer arr[]= {1,9,5,7,3,6,4,0};
		System.out.println("Given array::"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("sorting in ascending::"+Arrays.toString(arr));
		Arrays.sort(arr,c);
		System.out.println("sorting in descending::"+Arrays.toString(arr));
	}
  
}