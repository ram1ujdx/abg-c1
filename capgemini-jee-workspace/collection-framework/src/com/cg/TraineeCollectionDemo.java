package com.cg;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class CompareByAge implements Comparator<Trainee>{

	@Override
	public int compare(Trainee t1, Trainee t2) {
		 return t1.getAge()-t2.getAge();
	}
	
}


public class TraineeCollectionDemo {

	public static void main(String[] args) {
		
		Set<Trainee> trainees=new TreeSet<>(new CompareByAge());
		
		trainees.add(new Trainee("Rahul", 25, "rahul@gamil.com"));
		trainees.add(new Trainee("Mahesh", 26, "mahesh@gamil.com"));
		trainees.add(new Trainee("Priya", 24, "priya@gamil.com"));
		trainees.add(new Trainee("Rohit", 27, "rohit@gamil.com"));
		trainees.add(new Trainee("Rohit", 27, "rohit@gamil.com"));
		trainees.add(new Trainee("Rohit", 27, "rohit@gamil.com"));
		
		for(Trainee trainee:trainees) {
			
			System.out.println(trainee);
		}
		

	}

}
