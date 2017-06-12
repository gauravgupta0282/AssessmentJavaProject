package com.rabbit.consulting;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String to be reversed");
		String input = scanner.next();
		System.out.println("Reversed string is:"+new StringReverse().reverseString(input));
		scanner.close();
	}

	String reverse = "";

	public String reverseString(String str) {

		if (str.length() == 1) {
			return str;
		} else {
			reverse += str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
			return reverse;
		}
	}

}
