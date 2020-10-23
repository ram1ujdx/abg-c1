package com.cg;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ExerciseRunner {

	public static void main(String[] args) {
		
		List<Integer> items=Arrays.asList(12,201,510,325,32);
		System.out.println("Original Array..");
		
		items.forEach( item -> System.out.println(item));
		
		CollectionExercise obj=new CollectionExercise();
		
		List<Integer> resultArray=obj.getSortedArray(items);
		
		
		System.out.println("\nFinal Result....");
		
		
//		for(int item:resultArray) {
//			System.out.print(item+"\t");
//		}
		
		Iterator<Integer> itr=resultArray.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+"\t");
		}
		

	}

}
