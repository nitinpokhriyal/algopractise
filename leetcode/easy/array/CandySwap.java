package com.leetcode.array.easy;

import java.util.Arrays;

public class CandySwap {

	public static void main(String[] args) {
		CandySwap swap=new CandySwap();
		int[] ans=swap.fairCandySwap(new int[]{35,17,4,24,10}, new int[]{63,21});
		System.out.println(Arrays.toString(ans));
	}
	
	 public int[] fairCandySwap(int[] A, int[] B) {
	 
		 int aSum=0;
		 int bSum=0;
		 for(int i=0;i<A.length;i++){
			 aSum+=A[i];
		 }
		 for(int i=0;i<B.length;i++){
			 bSum+=B[i];
		 }
		 int[] result=new int[2];
		 for(int i=0;i<A.length;i++){
			 for(int j=0;j<B.length;j++){
				 if(aSum-A[i]+B[j]==bSum-B[j]+A[i]){
					 result[0]=A[i];
					 result[1]=B[j];
					 return result;
				 }
			 }
		 }
		 
		 
		 return new int[]{1,1};
	 }
}
