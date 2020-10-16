package com.cg;

public class PatternExample {

	public static void main(String[] args) {
		int lines=5;
		int i,j;
		for(i=1;i<=lines;i++){
			  for(j=1; j<=i; j++){
				System.out.print((i+j+1)%2+"  ");
				}
			  System.out.println();

			}

	}

}
