package com.cg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class CollectionExercise {

	public List<Integer> getSortedArray(List<Integer> items){
		
		List<Integer> reversedItems=new ArrayList<Integer>();
		for(int num:items) {
			int revNum=getReverse(num);
			reversedItems.add(revNum);
		}
		System.out.println("\nAfter Reversing..");
		for(int item:reversedItems) {
			System.out.print(item+"\t");
		}
		Collections.sort(reversedItems);
		return reversedItems;
		
	}
	
	public int getReverse(int number) {
		String numString=String.valueOf(number);
		String revString=new StringBuffer(numString).reverse().toString();
		return Integer.parseInt(revString);	
	}
	
}
