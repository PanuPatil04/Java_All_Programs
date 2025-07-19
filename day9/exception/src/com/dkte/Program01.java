package com.dkte;

class InvalidDateException extends RuntimeException {

	public InvalidDateException() {
	}

	public InvalidDateException(String message) {
		super(message);
	}
}

class Date {
	private int day;
	private int month;
	private int year;

	public void setDay(int day) {
		if (day <= 0 || day > 31)
			throw new InvalidDateException();
		this.day = day;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	public void setMonth(int month) {
		if (month <= 0 || month > 12)
			throw new InvalidDateException("Month should be between 1 to 12");
		this.month = month;
	}
}

public class Program01 {

	public static void main(String[] args) {
		Date d1 = new Date();
		d1.setDay(10);
		d1.setMonth(01);

		System.out.println(d1);
	}

}

