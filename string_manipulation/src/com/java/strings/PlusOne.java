package com.java.strings;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {
	
	public static void main(String[] args) {
		
		ArrayList<Integer>list = new ArrayList<Integer>(Arrays.asList(9,9,9,9,9));
		
		System.out.println(plusOne(list));
	}
	
	public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		
        int carry = 0;
        int leastSignificantBit = A.get(A.size() - 1) + 1;
        if(leastSignificantBit <= 9) {
        	 A.set(A.size() - 1,leastSignificantBit);
        }
        else {
        	carry = 1;
        	A.set(A.size() - 1,leastSignificantBit % 10);
        	for(int i = A.size() - 2; i>=0 ;i--){
                int modifiedElement = A.get(i) + carry;
                carry = modifiedElement/10;
                A.set(i,modifiedElement % 10);
            }
        }
        if(carry == 1) {
        	
        	ArrayList<Integer> B = new ArrayList<Integer>();
        	B.add(1);
        	B.addAll(A);
        	return B;
        }
        while(A.get(0) == 0){
            A.remove(0);
        }
        return A;
    }

}
