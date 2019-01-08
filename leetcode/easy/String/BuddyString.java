package com.leetcode.string.easy;

import java.util.HashSet;
import java.util.Set;

/*
 * Given two strings A and B of lowercase letters, return true if and only if 
 * we can swap two letters in A so that the result equals B.
 * */
public class BuddyString {

	public boolean buddyStrings(String a, String b) {
		boolean result=false;
		if(a.length()!=b.length()
				|| a.equals("") || b.equals(""))return false;

		
		int i=0,j=0;
		int indexHolder=-1;
		char[] bChar=b.toCharArray();
		if(a.length()==2 && b.length()==2){
				if(a.charAt(0)==a.charAt(1) && b.charAt(0)==b.charAt(1) && a.equals(b)){
					return true;
				}
		}
		if (a.equals(b)) {
			final Set<Character> record = new HashSet<Character>();
			for (final Character ch : a.toCharArray()) {
				if (record.contains(ch)) {
					return true;
				} else {
					record.add(ch);
				}
			}
		} else {
		while(i<a.length() && j<b.length()){
			if(a.charAt(i)!=b.charAt(j) ){
				if(indexHolder==-1){
					indexHolder=j;
				}else{
					char preVal=bChar[indexHolder];
					bChar[indexHolder]=bChar[j];
					bChar[j]=preVal;
					if(a.equals(new String(bChar)))result=true;
					break;
				}
			}
			i++;
			j++;
		}
		}
		return result;
    }
	
	public static void main(String[] args){
		BuddyString str=new BuddyString();
		System.out.println(str.buddyStrings("abab","abab"));
		
	}
}
