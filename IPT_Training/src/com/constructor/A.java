package com.constructor;

public class A extends B {
	public A() {
		this("Arun");
		System.out.println("A constructor");
	}
	public A(int mark) {
		System.out.println("Mark is "+mark);
	}
	public A(String name) {
		this(100);
		System.out.println("Name is "+name);
	}
	public static void main(String[] args) {
A a=new A();
	}

}
