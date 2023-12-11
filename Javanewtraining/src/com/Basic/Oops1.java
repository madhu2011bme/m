package com.Basic;

public class Oops1 {
    int x= 100;
    int y= 15;
	private void add(){
	int a= x+y;
	System.out.println("Add value:"+a);}
	private void sub(){
	int b= x-y;
	System.out.println("Sub value:"+b);}
	private void mul(){
	int c= x*y;
	System.out.println("Mul value:"+c); }
	private void div(){
	int d= x/y;
	System.out.println("Div value:"+d); }
	private void rem(){
	int e= x%y;
	System.out.println("Rem value:"+e); }
	public static void main(String[] args) {
		Oops1 newObj = new Oops1();
		newObj.add();
		newObj.sub();
		newObj.div();
		newObj.mul();
		newObj.rem();
	}

}
