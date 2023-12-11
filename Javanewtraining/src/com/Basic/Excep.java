package com.Basic;

public class Excep {
	
	public static void main(String[] args) {
		try
		{
			String s="JAVA";
		char charAt=s.charAt(5);
		System.out.println("input is true");
		}
		catch(ArithmeticException e)
		{
			//e.printStackTrace();
		System.out.println("Arithmetic Exception");}
		
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("out of bound");
		}
		finally
		{
			System.out.println("Success");
		}
		}
		
	
	}

