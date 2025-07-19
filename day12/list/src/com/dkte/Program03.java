package com.dkte;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
class Product implements Comparable<Product>{
	int pid;
	String name;
	double price;
	
	public Product() {
		
	}

	public Product(int pid, String name, double price) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product o) {
		
		return this.pid-o.pid;
	}
	
	
}

public class Program03 {

	public static void main(String[] args) {
		List<Product> l1=new ArrayList<>();
		l1.add(new Product(5,"Pen",20.0));
		l1.add(new Product(3,"Pencil",10.0));
		l1.add(new Product(2,"Eraser",60.0));
		l1.add(new Product(1,"Ruler",40.0));
		l1.add(new Product(4,"Compass",90.0));
		
		for (Product p : l1) {
			System.out.println(p);
		}
		
        System.out.println();
		
		System.out.println("--------------------------Sorting with id-----------------------------------");
		System.out.println();
		
		Collections.sort(l1);
		for (Product p : l1) {
			System.out.println(p);
		}
		
		
		System.out.println();
		
		System.out.println("--------------------------Sorting with Name-----------------------------------");
		System.out.println();
		class NameComparator implements Comparator<Product>{

			@Override
			public int compare(Product o1, Product o2) {
				return o1.name.compareTo(o2.name);
			}
		}
			NameComparator nc=new NameComparator();
			
			Collections.sort(l1,nc);
			
			for (Product p : l1) {
				System.out.println(p);
			}
			System.out.println();
			
			System.out.println("----------------------------Sorting With Price---------------------------------");
			System.out.println();
			class PriceComparator implements Comparator<Product>{

				@Override
				public int compare(Product o1, Product o2) {
					
					return Double.compare(o1.price, o2.price);
				}
			}
				PriceComparator pc=new PriceComparator();
				Collections.sort(l1,pc);
				
				for (Product p : l1) {
					System.out.println(p);
				}
				
				
			}
			
	
		

	

}
