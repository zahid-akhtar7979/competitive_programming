package com.java.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexString {
	
	public static void main(String[] args) {
		System.out.println(validateBatchName(""));
	}
	
	public static boolean validateBatchName(String mailId) {

		String regex = "^[a-zA-Z0-9 ]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mailId);
		return matcher.matches();
	}
	
	public static boolean validateMail(String mailId) {

		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mailId);
		return matcher.matches();
	}

	public static boolean validatePhone(String phoneNo) {

		String regex = "^[0-9]+-[1-9][0-9]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(phoneNo);
		return matcher.matches();
	}


}
