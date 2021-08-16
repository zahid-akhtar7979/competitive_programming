package com.java.strings;

import java.util.HashMap;
import java.util.Map;

public class SumSubArray {
	
	public static void main(String[] args) {
		
		int[] input  = new int[] {15, 2, 48, 19, 28, 22, 44, 2, 32, 46, 46, 24, 1, 23, 49, 26, 23, 17, 17, 46, 4, 30, 40, 36, 20, 5};
		int[] result = solve(input, 84);
		
		for(int i =0;i< result.length;i++) {
			
			System.out.print(result[i]);
			System.out.print(" ");
		}
	}

	public static int[] solve(int[] A, int B) {

		Map<Long, Integer>mapSum = new HashMap<Long, Integer>();
		long sum = 0;

		for(int i = 0; i < A.length; i++){

			sum = sum + A[i];
			mapSum.put(sum, i);
			
			if(sum == B){

				int[] result = new int[mapSum.get(sum) + 1];
				for(int j = 0 ; j <= mapSum.get(sum) ; j++){
					result[j] = A[j];
				}
				return result;
			}

			if(mapSum.containsKey(sum - B)){
				
				int low = Math.min(mapSum.get(sum - B), mapSum.get(sum));
				int high = Math.max(mapSum.get(sum - B), mapSum.get(sum));

				int[] result = new int[high - low];

				for(int k = low + 1, m=0 ; k <= high ; k++, m++){
					result[m] = A[k];
				}
				return result;
			}
		}
		return new int[]{-1};
	}

}
