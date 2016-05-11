package com.frankevych.strings;

import java.util.Scanner;

/**
 * @author Stepan Frankevych
 * @version 1.0
 * since 09.04.2016
 */
public class SeparatedWords {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter sentence");
		String sentence = scanner.nextLine();
		scanner.close();
		System.out.println("\nResult string is: \n");
		String [] charArray = getSeparateWords(sentence);
		output(charArray);
	}
	
	/**
	 * separate sentence by space
	 * @param sentece to separate
	 * @return array with separated words
	 * */
	public static String [] getSeparateWords(String sentence) {
		sentence = sentence.trim();
		sentence = sentence.replace(",", " ");
		sentence = sentence.replace(":", " ");
		sentence = sentence.replace(";", " ");
		sentence = sentence.replace("!", " ");
		sentence = sentence.replace("&", " ");
		sentence = sentence.replace("?", " ");
		sentence = sentence.replace(".", " ");
		sentence = sentence.replace("  ", " ");
		
		return sentence.split(" ");
	}
	
	public static void output(String [] charArray) {
		for (String string : charArray) {
			System.out.println(string);
		}
	}
}