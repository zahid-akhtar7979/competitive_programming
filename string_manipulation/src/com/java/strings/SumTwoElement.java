package com.java.strings;

import java.util.*;


public class SumTwoElement {
	
	
	public static void main(String[] args) {
		int[] arr = {4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8};
		int b = -3;
		List<Integer> arrayList = new ArrayList<Integer>();
		
		for(int ele : arr) {
			arrayList.add(ele);
		}
		ArrayList<Integer> result = twoSum(arrayList,b);
		System.out.println(result);
		
	}

	public static ArrayList<Integer> twoSum(final List<Integer> A, int B) {

		int indexFirst = -1;
		int indexSecond = Integer.MAX_VALUE;

		Map<Integer, Integer>map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i<A.size(); i++){
			
			if(!map.containsKey(B - A.get(i)) && !map.containsKey(A.get(i))){
				System.out.println(A.get(i));
				map.put((A.get(i)),i);
			}
			
				
			else if(map.containsKey(B - A.get(i))){
				
				int index1 = Math.min(i,map.get(B - A.get(i)));
				int index2 = Math.max(i,map.get(B - A.get(i)));

				if(index2 < indexSecond){
					indexFirst = index1;
					indexSecond = index2;
				}
			}
		}
		ArrayList<Integer>resultList = new ArrayList<Integer>();

		if(indexFirst != -1){
			resultList.add(indexFirst + 1);
			resultList.add(indexSecond + 1);
			return resultList;
		}
		return resultList;
	}

}
