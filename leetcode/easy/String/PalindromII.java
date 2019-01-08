package com.leetcode.string.easy;

public class PalindromII {

	public static void main(String[] args) {
		PalindromII palindrome=new PalindromII();
		boolean ans=palindrome.validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga");
		System.out.println(1%10);
		System.out.println(ans);
	}
	
	public boolean validPalindrome(String s) {
	    int l = 0, r = s.length()-1;
	    while (l<=r){ 
	    	if (s.charAt(l) != s.charAt(r)){ 
	        	return isPalindromic(s, l+1, r) || isPalindromic(s, l, r-1);
	        }else{
	    	 l++;
		     r--;
	        }
	    
	    }
	    return true;
	}

	public boolean isPalindromic(String s, int l, int r) {
	    while (l <= r){ 
	        if (s.charAt(l) != s.charAt(r)){ 
	        	return false;
	        }else{
	        l++;
	        r--;
	        }
	    }
	    return true;
	}
	
}
