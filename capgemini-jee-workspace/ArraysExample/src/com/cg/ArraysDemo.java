package com.cg;

import java.util.Arrays;
import java.util.Scanner;
import static java.util.Arrays.*;

public class ArraysDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int []nums= new int[5];
		System.out.println("Enter values : ");
		for(int i=0;i<nums.length;i++) {
			nums[i]=scan.nextInt();
		}
		
		System.out.println("Values are : ");
//		for(int i=0;i<nums.length;i++) {
//			System.out.print(nums[i]+"\t");
//		}
		
		for(int value:nums) {
			System.out.print(value+"\t");
		}
		
		sort(nums);
		System.out.println("After Sorting :");
		for(int value:nums) {
			System.out.print(value+"\t");
		}

	}

}
