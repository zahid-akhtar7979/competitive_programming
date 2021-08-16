package com.java.strings;

public class CombinatoricsRecurrence {
	
public static void main(String[] args) {
		
		int[][] result = solve(25);
		for(int i = 0;i<result.length;i++) {
			for(int j=0;j<result.length;j++) {
				System.out.print(result[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}

	}
	
	public static int[][] solve(int A) {
		
		int[][] result = new int[A][A];
		
		for(int i = 0 ;i<A ;i++){
			int k = 0;
			for(int j = 0 ; j<=i ;j++){
				
				if(j == 0) {
					result[i][0] = 1;
				}
				else if (k <= i){
					result[i][j] = result[i-1][j] + result[i-1][j-1];
				}
				
				k++;
			}
		}

		return result;

	}

}
