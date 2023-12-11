package com.Basic;

public class Loc_Var {
	private void myex() {
		int x= 30;//Local variable
		System.out.println("O/p:"+x);
	}
	
	static {
		System.out.println("Diplay of Output");
	}
	public static void main(String[] args) {
		Loc_Var a= new Loc_Var();
		a.myex();

	}

}
