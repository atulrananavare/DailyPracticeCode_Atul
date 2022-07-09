package com.demo.day1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondHighestNumber {

	public static void main(String[] args) {

		Integer arr[]= {12,13,45,11,18,22,19,20,45,33,40};
		
		Optional<Integer> secondMax = Arrays.stream(arr).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		
		System.out.println(secondMax.get());
		
	}

}
