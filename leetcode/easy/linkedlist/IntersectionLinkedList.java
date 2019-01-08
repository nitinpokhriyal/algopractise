package com.leetcode.linkedlist.easy;

import com.mentorpick.LinkedList.LLNode;

public class IntersectionLinkedList {
	public LLNode getIntersectionNode(LLNode headA, LLNode headB) {
        int a=1;
        int b=1;
        LLNode headC=headA;
        LLNode headD=headB;
        while(headC.next!=null){
            a++;
            headC=headC.next;
        }
        
         while(headD.next!=null){
            b++;
            headD=headD.next;
        }
        int pointer=Math.max(a-b,b-a);
        int c=1;
        if(a>b){
            while(headA.next!=null && c!=pointer){
                headA=headA.next;
                c++;
            }
        }else{
        	while(headB.next!=null && c!=pointer){
                headB=headB.next;
                c++;
        	}
        }
        
        while(headA.next!=null && headB.next!=null){
            if(headA.data==headB.data){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        
        return null;
    }
	
	public static void main(String[] args) {
		IntersectionLinkedList linkedList=new IntersectionLinkedList();
		LLNode nodeA=new LLNode(8);
		LLNode nodeB=new LLNode(4);
		LLNode node1=new LLNode(1);
		nodeB.next=node1;
		LLNode node2=new LLNode(8);
		node1.next=node2;
		LLNode node3=new LLNode(6);
		node2.next=node3;
		LLNode node4=new LLNode(3);
		node3.next=node4;
		
		linkedList.getIntersectionNode(nodeA, nodeB);
	}
}
///
/*0
[1]
[]
1
0*/