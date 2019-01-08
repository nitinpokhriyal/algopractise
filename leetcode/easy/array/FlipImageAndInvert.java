package com.leetcode.array.easy;

public class FlipImageAndInvert {
 public static void main(String[] args) {
	 FlipImageAndInvert flipImageAndInvert=new FlipImageAndInvert();
	 //flipImageAndInvert.flipAndInvertImage(new int[][]{{1,1,0},{1,0,1},{0,0,0}});
	 flipImageAndInvert.flipAndInvertImage(new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}});
}
 
 public int[][] flipAndInvertImage(int[][] A) {
     for(int j=0;j<A.length;j++){ 
    	 int mid=A[0].length%2==0?A[0].length/2:((A[0].length/2)+1);
        for(int i=0;i<mid;i++){
           int temp=A[j][i];
            A[j][i]=(1>>A[j][A[0].length-1-i]);
            A[j][A[0].length-1-i]=(1>>temp);
        }
     }
      return A;
  }
}
