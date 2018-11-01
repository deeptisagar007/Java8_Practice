package com.Java8.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		Mycompare mCom = new Mycompare();
		System.out.println(mCom.compare(10, 20));
		System.out.println(mCom.compare(110, 20));
		System.out.println(mCom.compare(120, 120));

		Comparator<Integer> compr = (num1, num2) -> {
			if (num1 < num2) {
				return 1;
			} else if (num1 > num2) {
				return -1;
			} else {
				return 0;
			}
		};

		System.out.println(compr.compare(10, 20));
		System.out.println(compr.compare(110, 20));
		System.out.println(compr.compare(120, 120));

		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(5);
		intList.add(15);
		intList.add(52);
		intList.add(45);
		intList.add(55);
		intList.add(52);
		intList.add(115);

		System.out.println("List: " + intList);

		Collections.sort(intList, new Mycompare());
		System.out.println("Sorted List: " + intList);

	}

}

class Mycompare implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 < o2) {
			return 1;
		} else if (o1 > o2) {
			return -1;
		} else {
			return 0;
		}
	}

}