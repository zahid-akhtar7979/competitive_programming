package com.java.strings;

public class GenerateSpiralMAtrix {
	public static void main(String[] args) {
		
		int[][] result = generateMatrix(5);
		for(int i= 0; i<5; i++) {
			for(int j= 0; j<5; j++) {
				System.out.print(result[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	
	public static int[][] generateMatrix(int A) {
		
        int[][] matrix = new int[A][A];
        int top = 0,bottom = A-1, left = 0, right = A-1;
        int element = 1;
        while(element <= A*A){
            for(int i = left ; i <= right; i++ ){
                matrix[top][i] = element;
                element++;
            }
            top ++;
            
            for(int i = top ; i <= bottom; i++ ){
                matrix[i][right] = element;
                element++;
            }
            right--;
            
            for(int i = right ; i >=left; i-- ){
                matrix[bottom][i] = element;
                element++;
            }
            bottom--;
            
            for(int i = bottom ; i >=top; i-- ){
                matrix[i][left] = element;
                element++;
            }
            left++;
            
        }
        return matrix;
    }

}
