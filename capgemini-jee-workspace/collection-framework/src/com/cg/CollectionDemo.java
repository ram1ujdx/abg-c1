package com.cg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		List items=new ArrayList();
		
		
		items.add("Mahesh");
		items.add(125);
		items.add(true);
		items.add(5.25);
		items.add(125);
		items.add(2, 500);
//		items.remove(true);
		
//		System.out.println(items);
		
		for(Object obj:items) {
			System.out.println(obj);
		}
		
		
		
		

	}

}
