package com.dkte;

import java.util.Arrays;

class Product implements Comparable<Product>{
	int id;
	String name;
	Double price;
	
	public Product() {
		
	}

	public Product(int id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", Price=" + price + "]";
	}

	/*@Override
	public int compareTo(Product o) {
		return this.id-o.id;
	}*/
	
	
	/*public int compareTo(Product o) {
		return this.name.compareTo(o.name);
	}*/
	
	public int compareTo(Product o) {
		return Double.compare(this.price,o.price);
	}
	
}
public class ProgramD {

	public static void main(String[] args) {
		Product[] arr=new Product[3];
		arr[0]=new Product(3,"Dairy-Milk",202.1);
		arr[1]=new Product(8,"Kit-Kat",89.1);
		arr[2]=new Product(1,"Silk",101.2);
		
		System.out.println("Before Sorting::");
		for(Product p:arr)
			System.out.println(p);
		
		Arrays.sort(arr);
		
		System.out.println("After Sorting::");
		for(Product p:arr)
			System.out.println(p);

	}

}
