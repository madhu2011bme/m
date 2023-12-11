package com.java.concepts;

public class Basic_Java {
	private void detail(String s) {
		System.out.println("Name of Student:"+s);
	}
	private void detail(String s, int t) {
		System.out.println("Reg Number of Student:"+t);
		}
	
	public static void main(String[] args) {
		Basic_Java data=new Basic_Java();
		data.detail("Jai");
		data.detail(null, 7798);
		
	}

}
