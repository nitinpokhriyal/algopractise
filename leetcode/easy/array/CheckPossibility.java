package com.leetcode.array.easy;

import java.util.Arrays;

public class CheckPossibility {

	public static void main(String[] args) {
		CheckPossibility chkPossiblity=new CheckPossibility();
		chkPossiblity.checkPossibility(new int[]{3,4,2,3});
	}
	
	public boolean checkPossibility(int[] nums) {
        if(nums.length==1)return true;
        boolean isPossible=false;
        int i=1;
        //int j=nums.length-1;
        for(;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                if(isPossible){
                    isPossible=false;
                    break;
                }else{
                    isPossible=true;
                }
            }
        }
       
        return isPossible;
    }
	
}
