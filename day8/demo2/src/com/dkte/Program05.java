package com.dkte;

public class Program05 {

	public static void main(String[] args) {
		
		try {
			Date d=new Date();
			d.setDay(27);
			d.setMonth(03);
			d.setYear(2005);
			System.out.println(d);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
