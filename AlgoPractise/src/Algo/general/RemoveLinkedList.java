package Algo.general;

/*
 * 
 * Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
 * */

public class RemoveLinkedList {
    public ListNode removeElements(ListNode head, int val) {
    	
    	ListNode headNode=new ListNode(0);
    	headNode.next=head;
    	ListNode parentNode=headNode;
    	ListNode currentNode=head;
    	while(currentNode!=null){
    		if(currentNode.val==val){
    			parentNode.next=currentNode.next;
    		}else{
    			parentNode=currentNode;
    		}
    		currentNode=currentNode.next;
    	}
    	return headNode.next;    	
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
    	
    	
    	RemoveLinkedList list=new RemoveLinkedList();
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
    	ListNode result=list.removeElements(listNode, 1);
    	
    	while(result!=null){
    		System.out.println(result.val);
    		result=result.next;
    	}
    	
    	
    }
    
}
