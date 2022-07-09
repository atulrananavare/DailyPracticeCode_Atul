package com.demo.day1;

public class IsDigits {

	public static void main(String[] args) {

		String str = "atul123abc8";

		// 1. Way1
		String word = str.replaceAll("\\d", "");
		System.out.println(word);

		// 2. Way2
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				temp = temp + str.charAt(i);
			}
		}
		System.out.println(temp);
	}

}
