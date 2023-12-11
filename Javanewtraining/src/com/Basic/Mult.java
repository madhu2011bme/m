package com.Basic;

public class Mult{
	 int a= 10;
	 int b=3; 
	 int y=a%b;
	 double z=a/b;
	 
	 private int output() {
		 return y; 
	}
	
	public static void main(String[] args) {
		Mult x= new Mult();
		System.out.println("Div: o/p:"+x.z);
		System.out.println("Rem: o/p:"+x.y);
		
		

	}
	}
