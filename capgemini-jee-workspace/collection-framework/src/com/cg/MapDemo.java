package com.cg;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> numsMap=new HashMap<>();
		numsMap.put(1, "One");
		numsMap.put(2, "Two");
		numsMap.put(3, "Three");
		numsMap.put(4, "Four");
		numsMap.put(5, "Five");
		
//		String val=numsMap.get(4);
//		System.out.println(val);
		
		for(int num:numsMap.keySet()) {
			System.out.println(num+" -- "+numsMap.get(num));
		}
		
		
		
		
		

	}

}
