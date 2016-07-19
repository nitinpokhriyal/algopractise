package Algo.general;


/**
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse 
 * order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 * */
public class AddLinkedListVal {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newLinkedNode =new ListNode(0);
		ListNode newListNode=newLinkedNode;
        int reminder=0;
        while(l1!=null && l2!=null){
        	int val1=l1.val;
        	int val2=l2.val;
        	int newSum=val1+val2+reminder;
        	reminder=0;
        	if(newSum/10>0){
        		reminder=newSum/10;
        		newSum=newSum%10;
        	}
        	newListNode.next=new ListNode(newSum);
        	newListNode=newListNode.next;
        	l1=l1.next;
        	l2=l2.next;
        }
       
        while(l1!=null){
        	int val1=l1.val+reminder;
        	reminder=0;
        	if(val1/10>0){
        		reminder=val1/10;
        		val1=val1%10;
        	}
        	newListNode.next=new ListNode(val1);
        	newListNode=newListNode.next;
        	l1=l1.next;
      
        }
        
        while(l2!=null){
        	int val2=l2.val+reminder;
        	reminder=0;
        	if(val2/10>0){
        		reminder=val2/10;
        		val2=val2%10;
        	}
        	newListNode.next=new ListNode(val2);
        	newListNode=newListNode.next;
        	l2=l2.next;

        }
        
        if(reminder!=0){
        	newListNode.next=new ListNode(reminder);
        }
        
		return newLinkedNode.next;
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
}
