package com.Basic;

public class Str_Type {

	public static void main(String[] args) {
		String name= "MADHUBALA";
		String name2="MADHUBALA";
		
		System.out.println("Immutable"+"\n");
		
		System.out.println(System.identityHashCode(name));
		System.out.println(System.identityHashCode(name2));
		
		StringBuffer exp= new StringBuffer("HAPPY");
		StringBuffer exp1= new StringBuffer("Day");
		
		System.out.println("\n"+"Mutable"+"\n");
		StringBuffer append= exp.append(exp1);
		System.out.println(append);
		System.out.println(System.identityHashCode(exp));
		System.out.println(System.identityHashCode(exp1));
		System.out.println(System.identityHashCode(append));
		
		
		
	}

}
