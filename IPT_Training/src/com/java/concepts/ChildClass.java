package com.java.concepts;

public class ChildClass extends ParentClass{
public void mother() {
	super.mother();
	System.out.println("Revathi");
}
public void son() {
	this.mother();
System.out.println("Madhu");
}
	public static void main(String[] args) {
	 ChildClass a=new ChildClass();
	 a.mother();
	 a.son();
	 
		
	}

}
