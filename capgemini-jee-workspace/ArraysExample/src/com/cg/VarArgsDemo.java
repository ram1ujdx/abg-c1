package com.cg;

public class VarArgsDemo {

	public static int findSum(int...nums) {
		int sum=0;
		for(int value:nums) {
			sum+=value;
		}
		return sum;
	}
	
	
	
	public static void main(String[] args) {
		
		int sum=findSum(25,5,20,78);
		System.out.println("Sum = "+sum);

	}
	
	

}
