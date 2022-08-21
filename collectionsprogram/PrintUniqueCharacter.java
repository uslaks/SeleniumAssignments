package collectionsprogram;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	//PrintUniqueCharacter
	/*
	 * Problem
	 * 
	 * a) Take your name as input
	 * b) Print all unique characters only (any order)
	 * 
	 * Input:  babu
	 * Output: a u 
	 * 
	 */

	/*
	 * Psuedocode
	 * 
	 * a) Convert String to Character array
	 * b) Create a new Set -> HashSet
	 * c) Add each character to the Set and if it is already there, remove it
	 * d) Finally, print the set
	 * 
	 */

	public static void main(String[] args) {

		// To create a String variable to store a name
		String name = "nagarajan";

		// To convert String to character array
		char[] character = new char[name.length()];
		
		for(int i=0; i<name.length(); i++) {

			character[i] = name.charAt(i);

		}

		// To add each character to the Set
		Set<Character> charSet = new HashSet<Character>();

		for(char eachChar:character) {

			if(charSet.contains(eachChar)) {

				charSet.remove(eachChar);

			} else {

				charSet.add(eachChar);

			}		

		}

		System.out.println("The Unique Character Set is : "+charSet);

	}

}
