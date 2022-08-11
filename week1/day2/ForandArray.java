package week1.day2;

import java.util.Arrays;

public class ForandArray {
	
	public static void main(String[] args) {
		
		for (int num =51; num<= 77; num++) {
			
			if(num%2 !=0) {
				System.out.println(num);
			}
			
		}
		
		int [] numbers = {22,67,98,1,34,58,99};
		Arrays.sort(numbers);
		System.out.println(numbers[numbers.length-2]);
		
	}
	
}
