package com.java.strings;

public class AntiDiagonals {
	
	public static void main(String[] args) {
		int[][] input = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		int[][] result = diagonal(input);
		for(int i =0;i<result.length;i++) {
			for(int j=0;j<result[0].length;j++) {
				System.out.print(result[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static int[][] diagonal(int[][] A) {
        int[][] result = new int[2*A.length -1][A.length];
        
        for(int i = 0;i<A.length ; i++){
            int colIndex = i, rowIndex = 0;
            for(int j = 0; j<=i; j++){
                result[i][j] = A[rowIndex][colIndex];
                rowIndex++;
                colIndex--;
            }
        }
        int column = A.length-1, row = 1;
        for(int i = A.length;i<2*A.length -1; i++){
        	int colIndex = column, rowIndex = row;
            int k=A.length-2;
            for(int j = 0; j<=k && rowIndex <A.length && colIndex >=0; j++){
                result[i][j] = A[rowIndex][colIndex];
                rowIndex++;
                colIndex--;
            }
            row++;
            k--;
        }
        return result;
    }

}
