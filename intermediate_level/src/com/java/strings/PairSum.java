package com.java.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PairSum {

	public static void main(String[] args) {
		int[] input = {9, 5, 4, 9, 3, 6, 8, 7, 1, 2, 8, 7, 2, 9, 7, 1, 3, 9, 7, 8, 1, 0, 5, 5 };
		int[] output = equal(input);

		for(int i =0;i<output.length;i++) {
			System.out.print(output[i]);
			System.out.print(" ");
		}

	}

	public static int[] equal(int[] A) {

		class Pair {
			int firstIndex ,secondIndex;

			Pair(int firstIndex ,int secondIndex){
				this.firstIndex = firstIndex;
				this.secondIndex = secondIndex;
			}

			int getFirstIndex(){
				return this.firstIndex;
			}

			int getSecondIndex(){
				return this.secondIndex;
			}
		}

		int[] resultIndexes = new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE};

		Map<Integer, Pair>mapPairSum = new HashMap<Integer,Pair>();

		boolean isFound =false;

		for(int i = 0; i <A.length; i++){

			for(int j = i+1;j<A.length;j++){

				int sum = A[i] + A[j];

				if(mapPairSum.containsKey(sum)){
					
					
					Set<Integer> set = new HashSet<Integer>();
					
					int[] result = new int[4];

					Pair previousPair = mapPairSum.get(sum);

					int a = previousPair.getFirstIndex();
					int b = previousPair.getSecondIndex();
					int c = i;
					int d = j;

					result[0] = Math.min(a,b);
					result[1] = Math.max(a,b);
					result[2] = Math.min(c,d);
					result[3] = Math.max(c,d);

					set.add(result[0]);
					set.add(result[1]);
					set.add(result[2]);
					set.add(result[3]);
					
					if(set.size() == 4){
						
					
						isFound = true;

						for(int k = 0;k < 4 ;k++){

							if(result[k] < resultIndexes[k]){
								
								resultIndexes[0] = result[0];
								resultIndexes[1] = result[1];
								resultIndexes[2] = result[2];
								resultIndexes[3] = result[3];

								break;
							}
							
							if(result[k] > resultIndexes[k]) {
								break;
							}
						}

					}
				}
				else{
					mapPairSum.put(sum, new Pair(i,j));
				}
			}
		}

		if(isFound){
			return resultIndexes;
		}

		return new int[]{};

	}

}
