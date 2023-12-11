package com.Basic;

public class Prog3 extends Prog1{
	void mytask5() {
		System.out.println("Package access");
	}

	public void mytask6() {
		System.out.println("Global access");
	}
	public static void main(String[] args) {
		Prog3 p= new Prog3();
		p.mytask5();
		p.mytask2();
		p.mytask6();
		
	}

}
