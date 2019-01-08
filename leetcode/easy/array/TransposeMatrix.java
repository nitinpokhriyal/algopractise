package com.leetcode.array.easy;

public class TransposeMatrix {
	public static void main(String[] args) {
		int[][] A = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		//int[][] A = new int[][] {{1,2,3},{4,5,6}};
		int len = A.length / 2;
		int[][] B=new int[A[0].length][A.length]; 
		/*	for (int i = 0; i < A.length; i++) {
				int rows = i;
				int cols = i;
				for (int j = rows; j < A[0].length; j++) {
					if(A.length!=A[0].length) cols=j;
					if (rows < A.length && cols < A[0].length) {
						int temp = A[i][j];
						A[i][j] = A[j][i];
						A[j][i] = temp;
					}
				}
		}*/
 /*1 2 3
 4 5 6*/
	for (int i = 0; i < A.length; i++) {
		for(int j=0;j<A[0].length;j++){
			B[j][i]=A[i][j];
		}
	}
		System.out.println(1>>1);
	//System.out.println(A.length);
	}
}
