package com.java.strings;

import java.util.Scanner;
 
class GetInputFromUser {
    public static void main(String args[])
    {
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
 
 
        int a = Integer.parseInt(in.nextLine());
        System.out.println("You entered integer " + a);
        
        String s = in.nextLine();
        System.out.println("You entered string " + s);
 
        float b = Float.parseFloat(in.nextLine());
        System.out.println("You entered float " + b);
       
          // closing scanner
          in.close();
    }
}