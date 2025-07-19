package com.dkte;

public class Pen {
	
	private static <T> void display(T[] arr) {
		System.out.println();
		for(T element:arr)
			System.out.println("Element::"+element);
	}

	public static void main(String[] args) {
		Integer[] arr1= {10,30,20,40,60,50};
		display(arr1);
		
		Double[] arr2 = { 11.22, 22.33, 33.44, 44.55, 55.66 };
		display(arr2);
		
		String[] arr3= {"Panu","Pavan","Megha","Tushar"};
		display(arr3);
		
		

	}

}
