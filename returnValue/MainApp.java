package com.Java8.returnValue;

public class MainApp {

	public static void main(String[] args) {

		squareItInterface siI = para -> para * para;

		System.out.println(siI.squateIt(5));
		System.out.println(siI.squateIt(1000));
	}
}

@FunctionalInterface
interface squareItInterface {
	public int squateIt(int para);
}