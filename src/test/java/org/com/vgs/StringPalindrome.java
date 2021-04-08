package org.com.vgs;

public class StringPalindrome {
public static void main(String[] args) {
	String given = "MALAYALAM";
	String reverse ="";
	for(int i=given.length()-1;i>=0;i--) {
		reverse = reverse+given.charAt(i);
	}
	if(given.equals(reverse)) 
		System.out.println("Yes, Given string is palinmdrome");
	
	else 
		System.out.println("No, sGiven String is not a palindrome");
}
}
