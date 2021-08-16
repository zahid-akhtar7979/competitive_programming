package com.java.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RotateArrayNTimes {
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();    
        int testCases=Integer.parseInt(str);
        
        for(int i = 1; i<= testCases ;i++){
			String input = br.readLine();
			int rotationCount = Integer.parseInt(br.readLine());
			
			int[] arrayElem = new int[Integer.parseInt(input.split(" ")[0])];
			for(int j = 0; j < Integer.parseInt(input.split(" ")[0]) ; j++){
				arrayElem[j] = Integer.parseInt(input.split(" ")[j+1]);
			}
			getRotatedArray(arrayElem, rotationCount);
		}
		
		
//        Scanner sc = new Scanner(System.in);
//		int testCases = Integer.parseInt(sc.nextLine());
//		for(int i = 1; i<= testCases ;i++){
//			String input = sc.nextLine();
//			int rotationCount = Integer.parseInt(sc.nextLine());
//			
//			int[] arrayElem = new int[Integer.parseInt(input.split(" ")[0])];
//			for(int j = 0; j < Integer.parseInt(input.split(" ")[0]) ; j++){
//				arrayElem[j] = Integer.parseInt(input.split(" ")[j+1]);
//			}
//			getRotatedArray(arrayElem, rotationCount);
//		}
//		sc.close();
    
    }
    public static int[] getRotatedArray(int[] arrayElem, int rotationCount){
		
		rotationCount = rotationCount % arrayElem.length;
		int[] frontElements = new int[rotationCount];
		if(arrayElem.length == 0){
			return arrayElem;
		}

		for(int i = arrayElem.length - rotationCount, j=0;i < arrayElem.length;i++,j++){
			frontElements[j] = arrayElem[i];
		}
		for(int i = arrayElem.length-1;i >= rotationCount; i--){
			arrayElem[i] = arrayElem[i - rotationCount];
		}
		for(int i = 0  ;i < rotationCount; i++){
			arrayElem[i] =  frontElements[i];
		}
		for(int i = 0 ; i<arrayElem.length;i++) {
			System.out.print(arrayElem[i]);
		}
		return arrayElem;
	}
}
