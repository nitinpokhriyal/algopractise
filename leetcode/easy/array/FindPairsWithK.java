package com.leetcode.array.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindPairsWithK {
	 public int findPairs(int[] nums, int k) {
		 Arrays.sort(nums);
	        Map<Integer,Integer> tempList=new HashMap<Integer,Integer>();
		       for(int j=0;j<nums.length;j++){
		    	   if(!tempList.containsKey(nums[j])){
		    		   tempList.put(nums[j],1);
	               }else{
	                  int cnt= tempList.get(nums[j]);
	                   tempList.put(nums[j],++cnt);
	               }
		       }
		       
		        int total=0;
		        if(k==0){
                    Set<Integer> keys=tempList.keySet();
                    for(Integer key:keys){
                        int cnt=tempList.get(key);
                        if(cnt>1){
                            total++;
                        }
                    }
                 return total;   
                }
		        int i=1;
		        while(i<=tempList.size()){
	              //  if(tempList.containsKey(tempList.) && tempList.containsKey(tempList.get(i)+k)){
		                total++;
		   //         }
		            i++;
		        }
		        return total;
	    }
	 public static void main(String[] args) {
		 FindPairsWithK pair=new FindPairsWithK();
		 //pair.findPairs(new int[]{3,1,4,1,5}, 2);
		
	}
}
