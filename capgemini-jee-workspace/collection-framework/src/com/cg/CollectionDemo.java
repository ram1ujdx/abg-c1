package com.cg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


public class CollectionDemo {

	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		List items=Arrays.asList(10,25,30,5,15);
		
		List<Object> newItems=new LinkedList<>();
		
		newItems.addAll(items);
		newItems.add(10);
		
		System.out.println("Contents : ");
		for(int i=0;i<items.size();i++) {
			System.out.println(items.get(i));
		}
		
		
		int sum=0;
		
		for(Object item:items) {
			sum+=(int)item;
		}
		
		System.out.println("Sum = "+sum);
		

		int min,max;
//		min=max=items.get(0);
//		for(int item:items) {
//			if(item>max) {
//				max=item;
//			}
//			if(item<min) {
//				min=item;
//			}
//		}
//		

		
		min=(int) Collections.min(items);
		max=(int) Collections.max(items);
		System.out.println("Max = "+max);
		System.out.println("Min = "+min);

	}

}
