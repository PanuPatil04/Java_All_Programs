package com.dkte1;

import java.util.Arrays;

public class Pro01 {

	public static void main(String[] args) {
		Integer arr[]= {6,0,1,7,9,3,4,5};
		System.out.println("Given Array::"+Arrays.toString(arr));
		
		Arrays.sort(arr,(Integer i1,Integer i2)->{
			return i2-i1;
		});
		System.out.println("Desc. order Array::"+Arrays.toString(arr));

	}

}
