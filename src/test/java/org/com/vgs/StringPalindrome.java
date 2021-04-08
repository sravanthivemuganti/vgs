package org.com.vgs;

public class StringPalindrome {
public static void main(String[] args) {
	String given = "MADAM";
	String reverse ="";
	for(int i=given.length()-1;i>=0;i--) {
		reverse = reverse+given.charAt(i);
	}
	if(given.equals(reverse)) 
		System.out.println("Given string is Palinmdrome");
	
	else 
		System.out.println("Given String is not a Palindrome");
	
}
}
