package com.cg;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<Integer> items=new TreeSet<>();
		
		items.add(25);
		items.add(15);
		items.add(32);
		items.add(9);
		items.add(36);
		
		System.out.println(items);

	}

}
