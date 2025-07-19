package com.dkte.array;

import java.util.Arrays;

public class Pro02 {

	public static void main(String[] args) {
		String[] s1= {"Panu","Aarya","Samu","Dipali","Swati"};
		System.out.println("Before sort::"+Arrays.toString(s1));
		Arrays.sort(s1);
		System.out.println("After sort::"+Arrays.toString(s1));
		System.out.println("-------------------------------------------------------------");
		
		double arr2[] = { 44.55, 11.22, 33.44, 22.33, 55.66 };
		System.out.println("Before sorting - " + Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println("After sorting - " + Arrays.toString(arr2));
		System.out.println("-------------------------------------------------------------");
	
		int arr1[] = { 50, 20, 10, 40, 30 };
		System.out.println("Before sorting - " + Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println("After sorting - " + Arrays.toString(arr1));
		

	}

}
