package com.samodeika.adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterEverydayDemo {

	public static void main(String[] args) {

		Integer[] arrayOfInts = new Integer[] {53, 65, 67};
		
		List<Integer> listOfInts = Arrays.asList(arrayOfInts);
		
		System.out.println(arrayOfInts);
		
		System.out.println(listOfInts);
		
	}

}
