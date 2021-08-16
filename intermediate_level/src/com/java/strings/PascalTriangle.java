package com.java.strings;

public class PascalTriangle {

	public static void main(String[] args) {
		
		int[][] result = solve(22);
		
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
				if (k <= i){
					result[i][j] = (int)((fact(i)/(fact(i-j)*fact(j)))); 
				}
				else{
					result[i][j] = 0;
				}
				k++;
			}
		}
		return result;

	}

	public static long fact(int i){
		if(i == 0){
			return 1;
		}
		return i*fact(i-1);
	}

}
