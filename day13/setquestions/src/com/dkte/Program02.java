package com.dkte;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

class Product{
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
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Product))
			return false;
		Product other = (Product) obj;
		return id == other.id;
	}

	

	
	
}

public class Program02 {

	public static void main(String[] args) {
	Set<Product> s1=new LinkedHashSet<>();
	s1.add(new Product(1,"Pen",20));
	s1.add(new Product(5,"Pencil",30));
	s1.add(new Product(3,"Eraser",10));
	s1.add(new Product(2,"Ruler",05));
	s1.add(new Product(4,"Notebook",31));
	
	System.out.println("size of products - " + s1.size());
	
	for (Product p : s1) {
		System.out.println(p);
	}
	
	

	}

}
