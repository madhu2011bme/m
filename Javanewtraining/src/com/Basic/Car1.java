package com.Basic;

public class Car1{
	private void printer(String message, String sender)
	{
		System.out.println(message+sender);
	}
	private void printer(String message)
	{
		System.out.println(message);
	}
	
	public static void main(String[] args) {
		Car1 a= new Car1();
		a.printer("Room-mate :", " Bring me two trays of eggs.");
		a.printer("Broadcast message: Good morning India.");
	}
}
