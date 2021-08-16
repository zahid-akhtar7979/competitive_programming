package com.java.strings;

public class CharArrayToStringConversion {
	
	public static void main(String[] args) {
		
		char s[] = { 'g', 'e', 'e', 'k',
                	 's', 'f', 'o', 'r',
                	 'g', 'e', 'e', 'k', 's' };
		
		System.out.println(toStringUsingStringConstructor(s));
		System.out.println(toStringUsingStringValueOf(s));
		System.out.println(toStringUsingStringBuilder(s));
	}
	
	private static String toStringUsingStringConstructor(char[] arr) {
		
		String str = new String(arr);
		return str;
	}
	
	private static String toStringUsingStringValueOf(char[] arr) {

		String str = String.valueOf(arr);
		return str;
	}
	
	private static String toStringUsingStringBuilder(char[] arr) {
		
		StringBuilder str = new StringBuilder();
		for(int i =0;i<arr.length ;i++) {
			str = str.append(arr[i]);
		}

		return str.toString();
	}


}
