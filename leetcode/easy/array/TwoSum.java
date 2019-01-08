package com.leetcode.array.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	 public int[] twoSum(int[] nums, int target) {
		 System.out.println("".length());
	        Map<Integer,Integer> mapIdx=new HashMap<Integer,Integer>();
	        for(int i=0;i<nums.length;i++){
	            if(mapIdx.get(target-nums[i])!=null){
	                return new int[]{mapIdx.get(target-nums[i]),i};
	            }else{
	                mapIdx.put(nums[i],i);
	            }
	        }
	        
	        return new int[]{};
	    }
	 
	 public static void main(String[] args) {
		TwoSum twoSum=new TwoSum();
		System.out.println(twoSum.twoSum(new int[]{3,2,95,4,-3},92));
	}
}
