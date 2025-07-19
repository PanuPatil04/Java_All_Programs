package com.dkte;

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

