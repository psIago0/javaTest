package exercise1;

import java.util.Scanner;

public class Palindrome {
	
	// Check if the word is a palindrome
	
	public static boolean checkPalindrome(String word) {
		int lenWord = word.length(), i;
		String opossiteWord = "";
		
		for (i = (lenWord -1); i>=0; i--) {
			opossiteWord = opossiteWord + word.charAt(i); 
		}
		if (word.equals(opossiteWord)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		String word;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Choose a word to see if it's a palindrome: ");
		word = sc.nextLine();
		
		boolean bool = checkPalindrome(word);
		
		if(bool == true) {
			System.out.println("This word is a palindrome!");
		}
		
		else {
			System.out.println("This word isn't a palindrome!");
		}

		sc.close();
	}

}
