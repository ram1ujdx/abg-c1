package com.cg;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set items=new TreeSet();
		
	
		items.add("Rahul");
		items.add("Mohan");
		items.add(true);
		items.add("Mohan");
		items.add(5);


		
		for(Object item:items) {
			System.out.println(item);
		}
	
		
		
	}

}
