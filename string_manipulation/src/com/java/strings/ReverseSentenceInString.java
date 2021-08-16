package com.java.strings;

public class ReverseSentenceInString {
	
	public static void main(String[] args) {
		String str = "       fwbpudnbrozzifml osdt ulc jsx kxorifrhubk ouhsuhf sswz qfho dqmy sn myq igjgip iwfcqq                 ";
		System.out.println(solve(str));
	}

	public static String solve(String A) {

		StringBuilder sb = new StringBuilder();

		for(int i = A.length() - 1, j = A.length()-1; i >= 0; i--){
			
			while(i >= 0 && A.charAt(j) == ' ') {
				
				System.out.println(i);
				System.out.println(j);
				j--;
				i--;
			}

			if(i >= 0 && A.charAt(i) == ' ' || i == 0){

				int startIndex = i == 0 ? i : i+1;   
				int endIndex = j;
				
				while(startIndex <= endIndex){

					sb.append(A.charAt(startIndex));
					startIndex++;
				}
				j = i - 1;
				sb.append(' ');
			}
		}
		return sb.deleteCharAt(sb.length() - 1).toString();
	}

}
