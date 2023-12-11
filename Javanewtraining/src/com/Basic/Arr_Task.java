package com.Basic;

public class Arr_Task {

	public static void main(String[] args) {

		int array[]= {11,12,13,14,15,16};
		int even=0;int odd=0;
		for(int i=0;i<=array.length-1;i++) {
			if(array[i]%2==0) {
				even++;
			}
			else
				odd++;
		}
			System.out.println("Count of the even numbers=  "+even);
			System.out.println("Count of the odd numbers =  "+odd);
			
			
			
	}
}

