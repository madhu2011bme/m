package com.Basic;

public class Scooter implements Vehicle, Car, Bike {
	
	public void start() {
		System.out.println("Option:"+ "Start");

	}
	public void stop() {
		System.out.println("Option:"+ "Stop");

	}	public void accelerate() {
		System.out.println("Option:"+ "accelerate");

	}	public void brake() {
		System.out.println("Option:"+ "brake");

	}	
	public static void main(String[] args) {
		Scooter a= new Scooter();
		a.start();
		a.stop();
		a.accelerate();
		a.brake();
	}

}
