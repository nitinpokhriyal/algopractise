package Algo.stringproblem;

import java.util.Arrays;

/*
 * Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * 
 * */

public class RemoveElement {

	 public int removeElement(int[] nums, int val) {
		 int i=0;
		 int j=0;
		 while(i<nums.length){
			if(nums[i]!=val){
				nums[j]=nums[i];
				j++;
			}
			
			i++;
		 }
		
		// System.out.println(Arrays.toString(nums));
		 return j;
	 }
	 
	 
	 public static void main(String[] args){
		 RemoveElement element=new RemoveElement();
		System.out.println(element.removeElement(new int[]{3,2,2,3},3));
	 }
	
}
