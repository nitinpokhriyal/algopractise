package com.leetcode.array.easy;

public class ThirdMaximum {
	public static void main(String[] args) {
		ThirdMaximum maximum=new ThirdMaximum();
		maximum.thirdMax(new int[]{1,2,1});
	}
	 public int thirdMax(int[] nums) {
	        if(nums.length==1)return nums[0];
	        if(nums.length==2){
	            return Math.max(nums[0],nums[1]);
	        }
	        
	        long max=Long.MIN_VALUE;
	        long max2=Long.MIN_VALUE;
	        long max3=Long.MIN_VALUE;
	        for(int i=0;i<nums.length;i++){
	            if(max<nums[i]){
	                max3=max2;
	                max2=max;
	                max=nums[i];
	            }else{
	                if(nums[i]!=max){
	                    if(nums[i]>max2){
	                        max3=max2;
	                        max2=nums[i];
	                    }else{
	                        if(nums[i]!=max2 && nums[i]>max3)
	                            max3=nums[i];
	                    }
	                }
	            }      
	        }
	        if(max3==Long.MIN_VALUE){
	            //if(max2==0){
	                max3=max;
	            /*}else{
	                max3=max2;
	            }*/
	        }
	        return new Long(max3).intValue();
	    }
}
