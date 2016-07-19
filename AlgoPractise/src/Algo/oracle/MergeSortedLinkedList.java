package Algo.oracle;

import java.util.Arrays;
import java.util.LinkedList;


/**
 * merge two sorted linked list(not arraylist)
 * 
 * */

public class MergeSortedLinkedList {

	
	
	public void sortLinkedList(LinkedList<Integer> l1,LinkedList<Integer> l2){
		
		LinkedList<Integer> newLinkedList=new LinkedList<Integer>();
		
		int i=0,j=0;
		while(l1.size()>i && l2.size()>j){
			Integer iValue=(Integer)l1.get(i);
			Integer jValue=(Integer)l2.get(j);
			if(iValue<jValue){
				newLinkedList.add(iValue);
				i++;
				//k++;
			}else{
				newLinkedList.add(jValue);
				j++;
			}
		}
		
		while(l1.size()>i){
			Integer iValue=(Integer)l1.get(i);
			newLinkedList.add(iValue);
			i++;
		}
		
		while(l2.size()>j){
			Integer jValue=(Integer)l2.get(j);
			newLinkedList.add(jValue);
			j++;
		}
		
		System.out.println(Arrays.toString(newLinkedList.toArray()));
	}
	
	public void mergeSortedlists(Node node1,Node node2){
		Node newHead=new Node(null);
		Node currentHead=newHead;
		
		while(node1!=null || node2!=null){
			Integer data2=null;
			Integer data1=null;
			if(node1!=null){
				data1=(Integer)node1.getData();
			}
			if(node2!=null){
				data2=(Integer)node2.getData();
			}
			if(data1!=null && data2!=null){
				if(data1<data2){
					currentHead.setNext(node1);
					node1=node1.next;
				}else{
					currentHead.setNext(node2);
					node2=node2.next;
				}
				currentHead=currentHead.next;
			}else if(data1!=null){
				currentHead.setNext(node1);
				node1=node1.next;
			}else if(data2!=null){
				currentHead.setNext(node2);
				node2=node2.next;
			}
			
		}

		while(newHead!=null){
			System.out.println(newHead.getData());
			newHead=newHead.next;
		}
	}
	
	private class Node
	{
		// reference to the next node in the chain,
		// or null if there isn't one.
		Node next;
		// data carried by this node.
		// could be of any type you need.
		Object data;
		

		// Node constructor
		public Node(Object _data)
		{
			next = null;
			data = _data;
		}
		
		// another Node constructor if we want to
		// specify the node to point to.
		public Node(Object _data, Node _next)
		{
			next = _next;
			data = _data;
		}
		
		// these methods should be self-explanatory
		public Object getData()
		{
			return data;
		}
		
		public void setData(Object _data)
		{
			data = _data;
		}
		
		public Node getNext()
		{
			return next;
		}
		
		public void setNext(Node _next)
		{
			next = _next;
		}
	}
	
	public static void main(String[] args){
	
		LinkedList<Integer> test=new LinkedList<Integer>();
		test.add(1);
		test.add(3);
		test.add(5);
		test.add(7);
		test.add(9);
		
		LinkedList<Integer> test1=new LinkedList<Integer>();
		test1.add(2);
		test1.add(4);
		test1.add(6);
		test1.add(8);
		test1.add(10);
		
		MergeSortedLinkedList mergeSortedLL= new MergeSortedLinkedList();
		//mergeSortedLL.sortLinkedList(test,test1);
		Node node1=mergeSortedLL.new Node(2);
		Node node2=mergeSortedLL.new Node(4);
		Node node3=mergeSortedLL.new Node(6);
		Node node4=mergeSortedLL.new Node(8);
		Node node5=mergeSortedLL.new Node(10);
		node4.setNext(node5);
		node3.setNext(node4);
		node2.setNext(node3);
		node1.setNext(node2);
		
		
		
		Node node6=mergeSortedLL.new Node(1);
		Node node7=mergeSortedLL.new Node(3);
		Node node8=mergeSortedLL.new Node(5);
		Node node9=mergeSortedLL.new Node(7);
		Node node10=mergeSortedLL.new Node(9);
		
		node9.setNext(node10);
		node8.setNext(node9);
		node7.setNext(node8);
		node6.setNext(node7);
		
		
		mergeSortedLL.mergeSortedlists(node1, node6);
	}
	
	
	
}
