package com.dkte3;

import java.util.Arrays;
import java.util.Comparator;

public class Pro03 {

	public static void main(String[] args) {
		Integer arr[]= {8,1,5,7,3,9,0,4};
		System.out.println("given array::"+Arrays.toString(arr));
		
		//anonymous object of anonymous inner class.
		Arrays.sort(arr,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
			
		});
		System.out.println("Descending order array::"+Arrays.toString(arr));

	}

}
