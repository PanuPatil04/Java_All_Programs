package com.dkte3;

class Box<T> {
	private T obj;
	
	

	public Box(T obj) {
		
		this.obj = obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}
}


public class Program03 {
	//upper bound ->extends.....
	public static void displayBox(Box<? extends Number> b) {
		System.out.println("Value::"+b.getObj());
	}
	
	public static void main(String args[]) {
	
	Box<Integer> b1=new Box<Integer>(10);
	displayBox(b1);
	Box<Double> b2=new Box<Double>(11.2);
	displayBox(b2);
	/*Box<String> b3=new Box<String>("Panu"); //not ok
	displayBox(b3);
	Box<Date> b4=new Box<Date>(new Date());
	displayBox(b4);
	*/
	
	}
}

