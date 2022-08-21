package collectionsprogram;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
public static void main(String[] args) {		
		
//		Declare a String as PayPal India
		String name = "PayPal India";

//		Convert it into a character array
		char[] character = new char[name.length()];
		
		for(int i=0; i<name.length(); i++) {

			character[i] = name.charAt(i);

		}

//		Declare a Set as charSet for Character
		Set<Character> charSet = new LinkedHashSet<Character>();
		
//		Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupCharSet = new LinkedHashSet<Character>();

//		Iterate character array and add it into charSet
		for(char eachChar:character) {

//		if the character is already in the charSet then, add it to the dupCharSet
			if(charSet.contains(eachChar)) {

				dupCharSet.add(eachChar);

			} else {

				charSet.add(eachChar);

			}		

		}
		
		System.out.println("charSet : "+charSet);
		System.out.println("dupCharSet : "+dupCharSet);

//		Check the dupCharSet elements and remove those in the charSet

//		Iterate using charSet

//		Check the iterator variable isn't equals to an empty space

//		print it

	}


	

}
