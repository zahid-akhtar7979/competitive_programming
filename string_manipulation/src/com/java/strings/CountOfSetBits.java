package com.java.strings;

public class CountOfSetBits {
	
	public static void main(String[] args) {
		System.out.println(solve(1000000000));
	}

	public static int solve(int A) {
		
		int countOfBits = 0;
		
		for(int i = 0; Math.floor(A/Math.pow(2, i)) > 0 ; i++) {
			
			System.out.println("i is "+i);
			
			countOfBits = (int) ((countOfBits + Math.floor(A/(Math.pow(2, i+1))) * Math.pow(2, i))); 
			
			if(A%(Math.pow(2, i+1))>=(Math.pow(2, i)-1)) {
				countOfBits = (int) (countOfBits + A%(Math.pow(2, i+1))-(Math.pow(2, i)-1)); 
			}
		}
       return countOfBits;
    }
}
