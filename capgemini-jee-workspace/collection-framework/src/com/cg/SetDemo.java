package com.cg;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> items=new HashSet<String>();
		
	
		items.add("Rahul");
		items.add("Mohan");
//		items.add(true);
		items.add("Mohan");


		
		for(Object item:items) {
			System.out.println(((String)item).length());
		}
	
		
		
	}

}
