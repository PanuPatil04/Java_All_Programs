package com.dkte;

class Box1<T> {
	// private T obj = new T(); // NOT OK
	// private static T obj;// NOT OK
	private T obj;// NOT OK

	public void setObj(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}
}
public class pro2 {

	public static void main(String[] args) {
    //	Box1<int> b1 = new Box1<int>(); // NOT OK
		Box1<Integer> b1 = new Box1<>();

	}

}
