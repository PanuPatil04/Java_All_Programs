package com.dkte;

class Box<T> {
		private T obj;
		
		

		public Box(T obj) {
			super();
			this.obj = obj;
		}

		public void setObj(T obj) {
			this.obj = obj;
		}

		public T getObj() {
			return obj;
		}
	}

	class BoxObject {
		Object obj;
	}

	class BoxString {
		String obj;
	}

	public class Pro1 {

		public static void main(String[] args) {
			Box<Integer> b1 = new Box<Integer>(10);

			Box<Integer> b2 = new Box<>(20);

			Box<Integer> b3 = new Box(30);

			Box b4 = new Box(40);
			
			System.out.println(b1.getObj());
			System.out.println(b2.getObj());
			System.out.println(b3.getObj());
			System.out.println(b4.getObj());

//			Box<Object> b = new Box<String>(); // NOT OK
			Box<?> b = new Box<String>("50"); // OK
		}

	}
