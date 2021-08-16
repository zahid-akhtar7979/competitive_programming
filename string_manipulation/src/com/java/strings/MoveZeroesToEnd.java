package com.java.strings;

import java.util.Arrays;

public class MoveZeroesToEnd {
	
	public static void main(String[] args) {
		int[] input  =  {1,-2,0,4,3,0,0,0 };
		
		for(int i : input) {
			System.out.println(i);
		}
		
	}
	
	public static int[] moveZeroes(int[] input) {
		
		
		for(int i = 0 ,j = input.length- 1  ;i <= j; i++) {
			
			if(input[i] == 0  && input [j] != 0) {
				
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				
				j-- ;
				
			}
			
		}
		return input;
		
	}

}
