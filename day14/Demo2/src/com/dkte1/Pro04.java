package com.dkte1;

import java.util.function.BinaryOperator;

public class Pro04 {

	public static void doWork(Integer v1, Integer v2, BinaryOperator<Integer> op) {
		// some logic
		System.out.println("Result - " + op.apply(v1, v2));
	}

	public static void main(String[] args) {
		// non capturing lambda
		int z=10;
		doWork(10, 20, (x, y) -> x + y * z);
		doWork(20, 10, (x, y) -> x - y * z);
		doWork(10, 20, (x, y) -> x * y * z);

	}

}
