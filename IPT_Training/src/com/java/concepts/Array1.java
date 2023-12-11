package com.java.concepts;

import java.util.Iterator;

public class Array1 {

	public static void main(String[] args) {
		int[] a= new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		int[] b= {1,2,3};
//		System.out.println(a[2]);
		for(int i:a) {
			System.out.println(i);}
			for (int j = 0; j < a.length; j++) {
				System.out.println(a[j]);	
			}
			System.out.println(a);
			}

}
