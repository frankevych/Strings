package com.frankevych.strings;

import java.util.Scanner;

/**
 * ChangeWord - this class will replace a word in sentence 
 * 
 * @version 1.0 
 * @author Stepan Frankevych
 * @since 09.04.2016
 * */
public class ChangeWord {
	
	private String sentence;
	
	public static void main(String[] args){
		ChangeWord changeWord = new ChangeWord();
		
		System.out.println("Enter your sentence: ");
		Scanner scanner = new Scanner(System.in);
		changeWord.setSentence(scanner.nextLine());
		System.out.println("Enter word which u want to replace: ");
		String wordToReplace = scanner.nextLine();
		System.out.println("Enter a word for replace: ");
		String replaceWithWord = scanner.nextLine();
		scanner.close();
		
		System.out.println("source sentence: " + changeWord.getSentence());
		changeWord.replaceWord(wordToReplace, replaceWithWord);
		System.out.println("\nsentence after replacing: " + changeWord.getSentence());
	}
	
	/**
	 * replace word
	 * @param wordToReplace find word in sentence and replace it
	 * @param replaceWithWord replace defined word with given
	 * */
	public void replaceWord(String wordToReplace, String replaceWithWord){
		sentence = sentence.replaceAll(wordToReplace, replaceWithWord);
	}
	
	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
}
