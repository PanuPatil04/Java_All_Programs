package com.dkte;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ProObjectStreamMain {

	public static void main1(String[] args) {
		Product p=new Product(1,"Pen",20.0);
		String path="D:/Pranali/myfile.txt";
		
		try(FileOutputStream fout=new FileOutputStream(path)){
			try(ObjectOutputStream oout=new ObjectOutputStream(fout)){
				oout.writeObject(p);
				System.out.println("File Saved :)");
			}
		}catch(Exception e) {
			e.printStackTrace();	
			}

	}
	public static void main2(String[] args) {
		
		String path="D:/Pranali/myfile.txt";
		
		try(FileInputStream oin=new FileInputStream(path)){
			try(ObjectInputStream ooin=new ObjectInputStream(oin)){
				Product p1=(Product) ooin.readObject();
				System.out.println("File Read :)"+p1);
			}
		}catch(Exception e) {
			e.printStackTrace();	
			}

	}
	public static void main3(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product(1, "Prod1", 100.0));
		list.add(new Product(2, "Prod2", 200.0));
		list.add(new Product(3, "Prod3", 300.0));
		String path = "D:/Pranali/myfile.txt";
		try(FileOutputStream fout = new FileOutputStream(path)) {
			try(ObjectOutputStream oout = new ObjectOutputStream(fout)) {
				oout.writeObject(list); // serialization
				System.out.println("File Saved.");
			} // oout.close();
		} // fout.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String path = "D:/Pranali/myfile.txt";
		try(FileInputStream fin = new FileInputStream(path)) {
			try(ObjectInputStream oin = new ObjectInputStream(fin)) {
				List<Product> list = (List<Product>) oin.readObject(); // de-serialization
				for(Product p : list)
					System.out.println("File Read: " + p);
			} // oin.close();
		} // fin.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}


}
