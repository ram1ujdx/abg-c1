package com.cg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TraineeMapDemo {

	public static void main(String[] args) {
		
		Map<String, Trainee> traineeData=new HashMap<>();
		
		Trainee t1=new Trainee("Mohit", 24, "mohit@gmail.com");
		Trainee t2=new Trainee("Rohan",25,"Rohan@gmail.com");
		Trainee t3=new Trainee("Tejas",26,"tejas@yahoo.com");
		
		traineeData.put(t1.getTraineeName(), t1);
		traineeData.put(t2.getTraineeName(), t2);
		traineeData.put(t3.getTraineeName(),t3);
		
		System.out.println("Enter the name : ");
		
		String name= new Scanner(System.in).nextLine();
		
		Trainee trainee=traineeData.get(name);
		System.out.println("Trainee Details : ");
		System.out.println(trainee);
		
		
	}

}
