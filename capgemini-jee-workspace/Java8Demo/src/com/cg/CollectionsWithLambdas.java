package com.cg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsWithLambdas {

	public static void main(String[] args) {

		List<Integer> items = Arrays.asList(7,3,9,1,3,5,2,4,6);

		int result=items.stream()
						.filter(i->{
									System.out.println("Filtered - "+i);
									return i%2==0;})
						.mapToInt(i->{   System.out.println("Mapped - "+i);
									return i*i;})
						.max().orElse(0);
	
		List<Integer> resultedItems=items.stream().filter(i->i%2==0).map(i->i*i).collect(Collectors.toList());
			
		System.out.println(resultedItems);
		
		System.out.println("Result = "+result);
	
	}

}
