package org.com.vgs;

public class Calculator {
	public static void main(String[]args) {
		int a=10,b=5;	
		addition(a,b);
	}
	public static void mul(int a,int b){
		int c=a*b;
		System.out.println("Multipilication of: "+c);
	}
	public static void addition(int a,int b) {
		int c=a+b;
		System.out.println("Addition of: "+c);
	}
	public static void subtraction(int a,int b) {
		int c=a-b;
		System.out.println("Subtraction of: "+c);
	}
	
}
