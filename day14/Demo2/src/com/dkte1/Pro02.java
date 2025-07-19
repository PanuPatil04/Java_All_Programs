package com.dkte1;

import java.util.Arrays;

public class Pro02 {

	public static void main(String[] args) {
		
			Integer arr[]= {6,0,1,7,9,3,4,5};
			System.out.println("Given Array::"+Arrays.toString(arr));
			
			Arrays.sort(arr, (i1,i2 ) -> i2-i1);
				System.out.println("Desc. order Array::"+Arrays.toString(arr));
			

		}

	}
