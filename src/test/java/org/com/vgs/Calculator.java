package org.com.vgs;

public class Calculator {
	public static void main(String[]args) {
		int a=10,b=5;	
		add(a,b);
	}
	public static void mul(int a,int b){
		int c=a*b;
	}
	public static void add(int a,int b) {
		int c=a+b;
		System.out.println("Addition of: "+c);
	}
}
