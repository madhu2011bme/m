package com.constructor;

public class B{
	public B() {
		System.out.println("B constructor");	}
	public B(int number) {
		System.out.println("Number is "+number);
	}
	public static void main(String[] args) {
		B b=new B();
	}
}
