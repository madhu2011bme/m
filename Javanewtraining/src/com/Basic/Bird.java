package com.Basic;

public class Bird extends Animal{
	void eat() {
		super.eat();
	}
	void eat(String a) {
		super.eat(a);
	}
public static void main(String[] args) {
	Bird op= new Bird();
	op.eat();
	op.eat("Bird eats seeds");
}
	}

