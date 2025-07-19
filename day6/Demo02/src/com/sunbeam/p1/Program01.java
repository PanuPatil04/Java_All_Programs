package com.sunbeam.p1;

import java.util.Objects;

class Date {
	int day;
	int month;
	int year;

	public Date() {
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj)// this-d1,obj-d2
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		// d1.day == d2.day, d1.month==d2.month....
		if (obj instanceof Date) {
			Date d2 = (Date) obj; // Downcasting
			if (this.day == d2.day && this.month == d2.month && this.year == d2.year)
				return true;
		}
		return false;
	}

}

public class Program01 {

	public static void main(String[] args) {
		Date d1 = new Date(1, 1, 2001);
		Date d2 = new Date(1, 1, 2001);
		System.out.println("d1 - " + d1);
		System.out.println("d2 - " + d2);
		System.out.println("(d1==d2) - " + (d1 == d2));
		System.out.println("(d1.equals(d2)) - " + (d2.equals(d1)));
//		System.out.println("(d1.equals(d2)) - " + (d1.equals("rohan"))); // false
	}

	public static void main2(String[] args) {
		Date d1 = new Date(1, 1, 2001);
		Date d2 = d1;
		System.out.println("d1 - " + d1);
		System.out.println("d2 - " + d2);
		System.out.println("(d1==d2) - " + (d1 == d2));
	}

	public static void main1(String[] args) {
		Date d1 = new Date();
		System.out.println(d1.toString());

		Date d2 = new Date(1, 1, 2001);
		System.out.println(d2);

	}

}
