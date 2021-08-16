package com.java.strings;

public class ReverseString {
	
	public static void main(String[] args) {
		System.out.println(reverseString("hello"));
		System.out.println(reverseStringUsingCharArray("hello"));
		System.out.println(reverseStringUsingInBuiltMethod("hello"));
		System.out.println(reverseStringUsingStringBuffer("hello"));
	}
	
	//using StringBuilder append method
	private static String reverseString(String str) {
		
		StringBuilder reversedString = new StringBuilder();
		for(int i = str.length()-1; i >= 0;  i--) {
			reversedString = reversedString.append(str.charAt(i));
		}
		return reversedString.toString();
	}
	
	//using char array and pairwise swapping first and last char
	private static String reverseStringUsingCharArray(String str) {
		
		char[] charArray = str.toCharArray();
		
		for(int i = 0 ,j = charArray.length-1; i<j; i++, j--) {
			char temp = charArray[i];   
			charArray[i] = charArray[j];
			charArray[j] = temp;
		}
		return String.valueOf(charArray);
	}
	
	/*
	 * String class does not have reverse() method, we 
	 * need to convert the input string to StringBuilder, 
	 * which is achieved by using the append method of StringBuilder. 
	 * After that, print out the characters of the reversed string by 
	 * scanning from the first till the last index. 
	 */
	private static String reverseStringUsingInBuiltMethod(String str) {
			
			StringBuilder reversedString = new StringBuilder(str);
			return reversedString.reverse().toString();
	}
	
	/*
	 * String class does not have reverse() method, 
	 * we need to convert the input string to StringBuffer, 
	 * which is achieved by using the reverse method of StringBuffer.
	 */
	private static String reverseStringUsingStringBuffer(String str) {
			
			StringBuffer reversedString = new StringBuffer(str);
			return reversedString.reverse().toString();
	}
}
