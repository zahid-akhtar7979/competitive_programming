package com.java.strings;

public class SortByColours {
	
	
	public static void main(String[] args) {
		
		int[] input1 = {0,1,2,0,1,2};
		
		int[] input = {2, 0, 0, 1, 0, 0, 2, 2, 1, 1, 0, 0, 1, 0, 2, 1, 1, 0, 1, 0, 1, 2, 2, 2, 0, 0, 1, 0, 2, 1, 1, 2, 1, 2, 2, 1, 0, 2, 2, 1, 1, 1, 0, 1, 0, 1, 0, 2, 1, 2, 0, 2, 0, 1, 1, 0, 2, 2, 1, 2, 0, 2, 1, 1, 1, 2, 0, 1, 0, 2, 2, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 2, 1, 1, 0, 2, 1, 2, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 1, 1, 0, 2, 1, 2, 2, 2, 1, 2, 2, 0, 1, 0, 1, 2, 1, 1, 0, 1, 2, 0, 1, 0, 2, 2, 1, 2, 1, 0, 2, 2, 1, 1, 0, 2, 1, 2};
		int[] output = sortColors(input1);
		for(int i =0;i<output.length;i++) {
			
			System.out.print(output[i]);
			System.out.print(" ");
		}
	}

	public static int[] sortColors(int[] A) {

		int mid = 0;
		int low = 0,temp = 0;
		int high = A.length - 1;

		while((mid <= high) && (mid < A.length - 1)){

			switch(A[mid]){

			case 0:
			{
				temp = A[mid];
				A[mid] = A[low];
				A[low] = temp;
				mid++;
				low++;
				break;
			}
			case 1:
			{
				mid++;
				break;
			}
			case 2:
			{
				temp = A[mid];
				A[mid] = A[high];
				A[high] = temp;
				high--;
				break;
			}
			}

		}

		return A;

	}
}