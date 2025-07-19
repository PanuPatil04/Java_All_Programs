package com.dkte;

public class Date {
	int day;
	int month;
	int year;
	

	public int getDay() {
		
		return day;
	}

	public void setDay(int day)  {
		if(day<=0 || day>31)
			throw new RuntimeException("Enter correct between 1 to 31");
		this.day = day;
	}

	public int getMonth()  {
		
		return month;
	}

	public void setMonth(int month) throws Exception{
		if(month<=0 || month>12)
			throw new Exception("Enter correct between 1 to 12");
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	

}
