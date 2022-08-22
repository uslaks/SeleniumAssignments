package javaChallenge;

public class LengthofWord {
	
	public static void main(String[] args) {
		
		// To return length of the last word in the string consisting of words and spaces
		// A word is a maximal substring consisting of non-space characters only
		
		// Input
		String message = "Hello World";
		
		// Split the String and retrieve its substring and length of the substring array
		String[] substring = message.split(" ");
		int length = substring.length;
		
		// To retrieve the last word of the substring array and its length
		String lastWord = substring[length-1];
		int lengthOfLastWord = lastWord.length();
		System.out.println("The length of the last word '"+lastWord+"' is "+lengthOfLastWord);
		
	}

}
