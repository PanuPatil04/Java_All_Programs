package com.dkte;

class InvalidTimeException extends Exception{
	public InvalidTimeException() {
		
	}
	
	public InvalidTimeException(String message) {
		super(message);
	}
}

class Time{
	private int hr;
	private int min;
	
	public void setHr(int hr) throws InvalidTimeException {
		if(hr<0 || hr>23)
			throw new InvalidTimeException("Enter hour between 0 to 23");
		this.hr = hr;
	}
	
	public void setMin(int min)throws InvalidTimeException {
		if(min<0 || hr>59)
			throw new InvalidTimeException("Enter hour between 0 to 59");
		this.min = min;
	}
	
	@Override
	public String toString() {
		return "Time [hr=" + hr + ", min=" + min + "]";
	}
	
	
	
}

public class Program02 {

	public static void main(String[] args) {
		Time t=new Time();
		try {
			t.setHr(12);
			t.setMin(40);
			System.out.println(t);
		} catch (InvalidTimeException e) {
			e.printStackTrace();
		}
		
		
	}

}
