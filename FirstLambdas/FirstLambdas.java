package com.Java8.FirstLambdas;

public class FirstLambdas {

	public static void main(String[] args) {

		functionalInterface FI = (name) -> System.out.println("First Lambda Expression" + name);
		FI.singleAbstractMethod("Deepti");
	}
}

@FunctionalInterface
interface functionalInterface {
	public void singleAbstractMethod(String name);
}
