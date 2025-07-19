package com.dkte.box;

class Box<T> {
	private T obj;

	public void setObj(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}
}

public class Program01 {

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>();
		b1.setObj(new Integer(10));
		
//		b1.setObj(new Double(10.20)); // NOT OK
		Integer i1 = b1.getObj();
		System.out.println("i1 - " + i1);

		Box<String> b2 = new Box();
		b2.setObj("sunbeam");
		String s = b2.getObj();
		System.out.println("s - " + s);
		
	    Box<Double> b3=new Box<Double>();
	    b3.setObj(new Double(10.32));
	    
	    Double d1=b3.getObj();
	    System.out.println("d1 - " + d1);
	    
	    
	}

}
