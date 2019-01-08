package com.leetcode.linkedlist.easy;

import com.mentorpick.LinkedList.LLNode;

public class MergeTwoSorted {
	
	public static void main(String[] args) {
		MergeTwoSorted mergeTwoSorted=new MergeTwoSorted();
		LLNode llNode1=new LLNode(1);
		LLNode llNode2=new LLNode(2);
		llNode1.next=llNode2;
		LLNode llNode5=new LLNode(5);
		llNode2.next=llNode5;
		
		LLNode llNode21=new LLNode(1);
		LLNode llNode3=new LLNode(3);
		llNode21.next=llNode3;
		LLNode llNode4=new LLNode(4);
		llNode3.next=llNode4;
		LLNode lResult=mergeTwoSorted.mergeTwoLists(llNode1, llNode21);
		while(lResult!=null){
			System.out.println(lResult.data);
			lResult=lResult.next;
		}
	}
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	    public LLNode mergeTwoLists(LLNode h1, LLNode h2) {
	    	LLNode newHeadNode=new LLNode(0);
	    	LLNode newNode=newHeadNode;
	      if(h1==null && h2==null) return null;
	       while(h1!=null && h2!=null){
	           if(h1.data<h2.data){
	                newNode.next=h1;
	                h1=h1.next;
	            }else{
	                newNode.next=h2;
	                h2=h2.next;
	            }
	           newNode=newNode.next;
	        }
	        if(h1!=null){
	              newNode.next=h1;
	        }  
	        if(h2!=null){
	            newNode.next=h2;
	        }  
	        
	        return newHeadNode.next;
	    }
}
