package com.dkte1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


class Product implements Comparable<Product>{
	int id;
	String name;
	double price;
	
	public Product() {
		
	}

	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product o) {
		
		return this.id-o.id;
	}
	
	
	
}

public class Program01 {

	public static void main(String[] args) {
		Set<Product> s1=new TreeSet<>();
		s1.add(new Product(1,"Pen",20));
		s1.add(new Product(6,"Pen",20));
		s1.add(new Product(5,"Pencil",30));
		s1.add(new Product(3,"Eraser",10));
		s1.add(new Product(2,"Ruler",05));
		s1.add(new Product(4,"Notebook",31));
        
		
		for (Product p : s1) {
			System.out.println(p);
			
		}
		

	} 

	public static void main1(String[] args) {
		
		class NameComparator implements Comparator<Product>{

			@Override
			public int compare(Product o1, Product o2) {
				
				return o1.name.compareTo(o2.name);
			}
		}
			NameComparator nc=new NameComparator();
			
	
		Set<Product> s1=new TreeSet<>(nc);
		s1.add(new Product(1,"Pen",20));
		s1.add(new Product(6,"Pen",20));
		s1.add(new Product(5,"Pencil",30));
		s1.add(new Product(3,"Eraser",10));
		s1.add(new Product(2,"Ruler",05));
		s1.add(new Product(4,"Notebook",31));
        
		
		for (Product p : s1) {
			System.out.println(p);
			
		}
		

	}

}
