package com.dkte3;

import java.util.Arrays;
import java.util.Comparator;

public class Pro01 {
	public static void main(String args[]) {
		
		class DescComparator implements Comparator<Integer>{

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
			
		}
		
		DescComparator dc=new DescComparator();
		Integer arr[]= {1,9,5,7,3,6,4,0};
		System.out.println("Given array::"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("sorting in ascending::"+Arrays.toString(arr));
		Arrays.sort(arr,dc);
		System.out.println("sorting in descending::"+Arrays.toString(arr));
	}
  
}
