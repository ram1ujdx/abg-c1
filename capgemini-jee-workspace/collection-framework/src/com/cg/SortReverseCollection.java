package com.cg;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortReverseCollection {

	public static void main(String[] args) {
		
		List<Integer> items=Arrays.asList(102,305,214,312,152);
		
		
		Collections.sort(items,new SortReverse());
		System.out.println(items);

	}

}

class SortReverse implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;
	}
}
