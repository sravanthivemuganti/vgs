package org.com.vgs;

public class ReverseString {
public static void main(String[] args) {
	String given = "Sravanthi";
	String reverse="";
	for(int i=given.length()-1;i>=0;i--) {
		reverse=reverse+given.charAt(i);
	}
	System.out.println("Reverse of a given string : "+reverse);
}
}
