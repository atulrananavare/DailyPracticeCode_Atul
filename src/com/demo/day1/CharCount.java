package com.demo.day1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCount {

	public static void main(String[] args) {
		
		String str="the big movie is live today! the is";
		
		String[] word = str.split(" ");
		
	 List<String> list = Arrays.asList(word);
	 
	Map<String, Long> wordCount = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

	System.out.println(wordCount);
  //wordCount.forEach((k,v)->System.out.println(k+": : "+v));
	
	
	String str1 = "Hello Manash";
    Map<Character,Long> hm = str1.chars()
    								.mapToObj(c->(char)c)
    								.collect(Collectors.groupingBy(c->c,Collectors.counting()));
    System.out.println(hm);

	
	}

}
