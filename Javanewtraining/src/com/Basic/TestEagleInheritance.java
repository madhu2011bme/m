package com.Basic;

public class TestEagleInheritance{
	protected void op() {
		System.out.println("Outer covering: "+"feather");
	}

	void op2() {
		System.out.println("Lifespan: "+"15");
	}
	public static void main(String[] args) {
    TestEagleInheritance oP= new TestEagleInheritance();
    oP.op();
    oP.op2();
    
	}

}