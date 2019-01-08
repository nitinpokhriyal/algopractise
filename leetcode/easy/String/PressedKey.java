package com.leetcode.string.easy;

public class PressedKey {
	public static void main(String[] args) {
		PressedKey key=new PressedKey();
		key.isLongPressedName("alex", "aaleex");
	}
	
	   public boolean isLongPressedName(String name, String typed) {
	        if(name.equals(typed))
	            return true;
	        if(name.length()>typed.length())
	            return false;
	        int i=0;
	        int j=0;
	        int nameLen=name.length();
	        int count=0;
	        
	        while(i<nameLen && j<typed.length()){
	            if(name.charAt(i)==typed.charAt(j)){
	                count++;
	                i++;
	                j++;
	            }else{
	                j++;
	            }
	        }
	        return count==nameLen;
	    }
}
