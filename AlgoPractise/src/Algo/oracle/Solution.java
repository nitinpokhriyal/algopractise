package Algo.oracle;

import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int numLength=nums.length;
        int i=0;
        int[] sumfound=null;
        while(i<numLength){
            int j=i+1;
            while(j<numLength){
                if(nums[i]+nums[j]==target){
                	sumfound=new int[]{i,j};
                    break;
                }
                j++;
            }
            i++;
        }
        return sumfound;
    }
    
    public static void main(String[] args){
    	Solution sol=new Solution();
    	System.out.println(Arrays.toString(sol.twoSum(new int[]{5,7,8,9}, 13)));
    }
}