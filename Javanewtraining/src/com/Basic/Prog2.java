package com.Basic;

public class Prog2 extends Prog1 {
	private void mytask3() {
		System.out.println("Class access");
	}

	protected void mytask4() {
		System.out.println("global access");
	}

	
	public static void main(String[] args) {
		Prog2 p = new Prog2();
		p.mytask3();
		p.mytask4();
		p.mytask1();
		p.mytask2();
	}

}
