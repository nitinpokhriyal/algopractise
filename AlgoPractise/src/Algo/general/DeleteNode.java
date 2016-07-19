package Algo.general;


/**
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

	Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 
	after calling your function.
 * */

public class DeleteNode {
	
	
	
	 public void deleteNode(ListNode node) {
			 node.val=node.next.val;
			 node.next=node.next.next;
	 }
	
	 
	    private class ListNode{
	    	private int val;
	    	private ListNode next;
	    	public ListNode(int val){
	    		this.val=val;
	    		
	    	}
	    	
	    	public void setVal(ListNode next){
	    		this.next=next;
	    	}
	    }
	 
	 public static void main(String[] args){
	    	
	    	
		 	DeleteNode list=new DeleteNode();
	    	ListNode listNode7=list.new ListNode(6);
	    	ListNode listNode6=list.new ListNode(5);
	    	listNode6.next=listNode7;
	    	ListNode listNode5=list.new ListNode(4);
	    	listNode5.next=listNode6;
	    	ListNode listNode4=list.new ListNode(3);
	    	listNode4.next=listNode5;
	    	ListNode listNode3=list.new ListNode(6);
	    	listNode3.next=listNode4;
	    	ListNode listNode2=list.new ListNode(2);
	    	listNode2.next=listNode3;
	    	ListNode listNode1=list.new ListNode(1);
	    	listNode1.next=listNode2;
	    	
	    	ListNode listNode=list.new ListNode(1);
	    	list.deleteNode(listNode);
	    	
	    	
	 }
}
