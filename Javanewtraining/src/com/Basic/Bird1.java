package com.Basic;

public class Bird1 {

	private void fly() {
		System.out.println("The bird is flying.");
	}
private void fly(int height) {
System.out.println("The bird is flying "+ height+ " feet height.");		
	}
private void fly(String name, int height) {
	System.out.println(name + " "+height+" feet height.");		
}
	public static void main(String[] args) {
		Bird1 op= new Bird1();
		op.fly();
		op.fly(10000);
		op.fly("The Eagle is flying", 10000);

	}

}
