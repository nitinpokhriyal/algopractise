package com.leetcode.string.easy;

public class StrStrImplementation {
	   public int strStr(String haystack, String needle) {
	        if(haystack==null || needle==null) return 0;
	        if(haystack.equals(needle)) return 0;
	        if(haystack.length()<needle.length()) return -1;
	        if(needle.length()==0) return 0;
	        int i=0;
	        int j=0;
	        while(i<haystack.length()){
	            if(haystack.charAt(i)==needle.charAt(j)){
	                int k=i;
	                boolean found=true;
	                int p=0;
	                for(;p<needle.length() && k<haystack.length();p++,k++){
	                    if(haystack.charAt(k)!=needle.charAt(p)){
	                        found=false;
	                        break;
	                    }
	                }
	                if(found && p==needle.length())
	                    return i;
	            }
	            i++;
	        }
	        return -1;
		}
	   
	   public static void main(String[] args) {
		StrStrImplementation str=new StrStrImplementation();
		//System.out.println(str.strStr("hello","ll"));
		System.out.println(str.strStr("mississippi","issipi"));
	}
}
