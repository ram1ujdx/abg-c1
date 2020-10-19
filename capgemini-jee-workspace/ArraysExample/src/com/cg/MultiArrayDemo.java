package com.cg;

public class MultiArrayDemo {

	public static void main(String[] args) {
		
		int [][]matrix= {{5,6,7},{2,3,4},{10,20,30}};
		
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				System.out.print(matrix[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		for(int[] rows:matrix) {
			for(int value:rows) {
				System.out.print(value+"\t");
			}
			System.out.println();
		}

	}

}
