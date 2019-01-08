package com.leetcode.string.easy;

import java.util.Arrays;

public class StringCompression {
	public static void main(String[] args) {
		StringCompression stringCompression = new StringCompression();
		//char[] a=new char[] { 'a', 'a', 'b', 'b', 'b', 'b', 'b' , 'b', 'b', 'b', 'b', 'b','b','b'};
		//char[] a=new char[] { 'a', 'a', 'a', 'b', 'b', 'a', 'a' };
		char[] a=new char[] { 'a', 'a', 'a', 'a', 'a', 'b' };
		//int newlen = stringCompression.compress(new char[] { 'a', 'a', 'b', 'b', 'c', 'c', 'c' });
		int newlen = stringCompression.compress(a);
		System.out.println(Arrays.toString(a));
		System.out.println(newlen);
	}

	public int compress(char[] chars) {
	  int n = chars.length;
      if(n==0 || n==1) return n;
      int i=0;
      int j=0;
      
      while(i<n && j<n){
    	  int count=0;
    	  count=0;
          chars[i] = chars[j];
    	  while(j<n && chars[i]==chars[j]){
    		  j++;
    		  count++;
    	  }
    	  i+=1;
    	  if(count>1){
    		  String countStr  = Integer.toString(count);
              for(int k=0;k<countStr.length() && i<n;i++,k++)
                 chars[i] = countStr.charAt(k);
    	  }
      }
      
      return i; 
	}
	
	
	/*
	public int compress(char[] chars) {
        int n = chars.length;
         if(n==0 || n==1) return n;
        
        int i=0,j=0,count=0;
        
        while(i<n && j<n){
            count=0;
            chars[i] = chars[j];
            while(j<n && chars[j]==chars[i]) {count++; j++;}
            i+=1;
            if(count>1){
                String countStr  = Integer.toString(count);
                for(int k=0;k<countStr.length() && i<n;i++,k++)
                   chars[i] = countStr.charAt(k);
            }
        }
        return i; 
    }*/
}
