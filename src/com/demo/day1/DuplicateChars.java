package com.demo.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateChars {

	public static void main(String[] args) {

		String str = "Java Programs";

		List<String> list = Arrays.asList(str.split(" "));

		Map<String, Long> num = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		//System.out.println(num);

		Map<Object, Long> hm = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		//System.out.println(hm);

		char[] arr = str.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : arr) {

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(str+":"+map);
	}

}
