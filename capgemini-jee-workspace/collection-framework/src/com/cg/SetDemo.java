package com.cg;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set items=new HashSet();
		
		items.add(10);
		items.add("Rahul");
		items.add("Mohan");
	
		items.add("Mohan");
		items.add(true);
		items.add(5<3);
		
		System.out.println(items);
		
		
		
	}

}
