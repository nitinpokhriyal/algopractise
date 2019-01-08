package com.leetcode.array.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairCards {

	public boolean hasGroupsSizeX(int[] deck) {
		Map<Integer, Integer> count = new HashMap<>();
		int res = 0;
		for (int i : deck)
			count.put(i, count.getOrDefault(i, 0) + 1);
		for (int i : count.values()) {
			res = gcd(i, res);
		}
		return res > 1;
	}

	public int gcd(int a, int b) {
		return b > 0 ? gcd(b, a % b) : a;

	}

	public static void main(String[] args) {
		PairCards cardnew = new PairCards();
		// System.out.println(cardnew.hasGroupsSizeX(new int[]
		// {0,0,0,0,0,0,0,1,2,3,3,3,4,5,6}));
		// System.out.println(96/58);
		cardnew.largeGroupPositions("aaa");

	}

	public List<List<Integer>> largeGroupPositions(String S) {
		char[] sArray = S.toCharArray();

		List<List<Integer>> ansList = new ArrayList<List<Integer>>();
		if (sArray.length == 1) {

			return ansList;
		}
		int stIdx = 0;
		char prevChar = sArray[0];
		// List<Integer> holderList=new ArrayList<Integer>();
		int count = 1;
		for (int i = 1; i < sArray.length; i++) {
			if (prevChar != sArray[i]) {
				// put new index
				if (count >= 3) {
					List<Integer> newIdxes = new ArrayList<Integer>();
					newIdxes.add(stIdx);
					newIdxes.add(i - 1);
					ansList.add(newIdxes);
				}
				count = 1;
				prevChar = sArray[i];
				stIdx = i;
			} else {
				count++;
				if (prevChar == sArray[i] && i == sArray.length - 1) {
					if ((prevChar == sArray[i] && i == sArray.length - 1)) {
						if (count >= 3) {
							List<Integer> newIdxes = new ArrayList<Integer>();
							newIdxes.add(stIdx);
							newIdxes.add(i);
							ansList.add(newIdxes);
						}
					}
				}
			}
		}
		return ansList;
	}
	
	
	public List<List<Integer>> largeGroupPositions1(String S) {
        List<List<Integer>> ans = new ArrayList<>();
 char[] arr = S.toCharArray();
 if(arr.length == 0 || arr.length == 1 || arr.length == 2) return ans;
 int curGroupLen = 0;
 int curStart = 0;
 char cur = arr[0];
 ArrayList<Integer> curList = new ArrayList<>();
 for(int index = 1 ; index < arr.length ; index++){
   char c = arr[index];
    if(c!=cur){
      if(curGroupLen>=2){
        curList.add(curStart);
        curList.add(curStart+curGroupLen);
        ans.add(curList);
        curList = new ArrayList<>();
      }
      curGroupLen=0;
      curStart=index;
      cur = c;
    }else{
      curGroupLen++;
    }
    
 }
              if(curGroupLen>=2){
        curList.add(curStart);
        curList.add(curStart+curGroupLen);
        ans.add(curList);
      }
 return ans;
}
}
