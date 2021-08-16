package com.java.strings;

public class RotateString {
	
	public static void main(String[] args) {
		System.out.println(solve("scaler", 2));
	}

	public static String solve(String A, int B) {
		
		int rotate = B % A.length();

		StringBuilder sb = new StringBuilder();

		for(int i = A.length() - 1; i >= A.length() - rotate ;i-- ){
			sb.append(A.charAt(i));
		}

		for(int i = 0; i < A.length() - rotate ;i++){
			sb.append(A.charAt(i));
		}

		return sb.toString();

	}

}
