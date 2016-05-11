package com.frankevych.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * search letters that is present in word one but missing from second word!
 * @author Stepan Frankevych
 * @version 1.0
 * @since 09.04.2016
 */
public class FindDifferentLetters {

	private static final String WORD_ONE = "comprehensive";
	private static final String WORD_TWO = "austronawt";
	
	public static void main(String[] args){
		FindDifferentLetters letters = new FindDifferentLetters();
		List<Character> differentLetters = letters.findDifferentLetters(WORD_ONE, WORD_TWO);
		System.out.println("different letters are: ");
		letters.output(differentLetters);
	}
	
	/**
	 * compares two words and find missing letters
	 * @param wordOne
	 * @param wordTwo
	 * @return List of missing characters in words
	 * */
	public List<Character> findDifferentLetters(String wordOne, String wordTwo){
		List<Character> listOfLetters = new ArrayList<>();
		for (int i = 0; i < wordOne.length(); i++) {
			if(!wordTwo.contains(wordOne.charAt(i) + "")){
				listOfLetters.add(wordOne.charAt(i));
			}
		}
		return listOfLetters;
	}
	
	public void output(List<Character> list) {
		for (Character character : list) {
			System.out.print(character + " ");
		}
	}
}
