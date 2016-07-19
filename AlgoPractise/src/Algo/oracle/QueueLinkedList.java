package Algo.oracle;

import java.util.LinkedList;
import java.util.List;

public class QueueLinkedList<T> {

	List<Node> linkedList=new LinkedList<Node>();
	int head=0,last,total=10;
	
	public void enqueue(String data) throws Exception{
		int i=0;
		Node node=new Node(data,null);
		if(!isFull()){
			linkedList.add(node);
			last++;
		}else{
			throw new Exception();
		}
	}
	
	
	public void dequeue(){
		linkedList.remove(head);
		last--;
		total--;
	}
	
	private boolean isFull(){
		if(total==last){
			return true;
		}
		return false;
	}
	
	public int size(){
		return total;
	}
	
	private class Node{
		String data=null;
		Node nextNode=null;
		private Node(String data,Node nextNode){
			this.data=data;
			this.nextNode=nextNode;
			
		}
		
		public String getData(){
			return data;
		}
		
		public void setData(String data){
			this.data=data;
		}
			
		public Node getNextNode(){
			return this.nextNode;
		}
		
		public void setNode(Node node){
			this.nextNode=node;
		}
		
	}
	
	
	public static void main(String[] args){
		QueueLinkedList<String> queLinkedList=new QueueLinkedList<String>();
		try{
			queLinkedList.enqueue("a");
			queLinkedList.enqueue("b");
			queLinkedList.enqueue("c");
			queLinkedList.enqueue("d");
			queLinkedList.enqueue("e");
			queLinkedList.enqueue("f");
			queLinkedList.enqueue("g");
			queLinkedList.enqueue("h");
			queLinkedList.enqueue("i");
			queLinkedList.enqueue("j");
			//queLinkedList.enqueue("k");
			
			System.out.println(queLinkedList.size());
			
			queLinkedList.dequeue();
			System.out.println(queLinkedList.size());
		}catch(Exception e){
			
		}
	}
	
}
