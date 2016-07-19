package Algo.oracle;

import javax.management.RuntimeErrorException;

public class QueueLinkedListV2 {

	private int total;

    private Node first, last;
    int limit=10;
    Node[] arrayInteger=null;
    public QueueLinkedListV2(){
    	arrayInteger=new Node[10];
    }
    
    private class Node {
        private Node next;
        private String data;
        
        public Node(String data){
        	this.data=data;
        }
    }
    
    public void enqueue(String data){
    	if(limit==total){
    		throw new RuntimeException("queue is full");
    	}
    	if(data==null){
    		throw new RuntimeException("Null value not allowed in queue");
    	}
    	Node ele=new Node(data);
    	if(first==null){
    		last=ele;
    	}else{
    		last.next=ele;
    		last=ele;
    	}
    	if(total==0)first=last;
    	
    	total++;
    }
    
    public void dequeue(){
    	if(first==null){
    		throw new RuntimeException("no element to delete");
    	}
    	first=first.next;
    	total--;
    }
	
    public int size(){
    	return total;
    }
    
    public void printElement(){
    	Node node=first;
    	int i=0;
    	while(node!=null){
    		System.out.println("i = " + i +" node value is " + node.data);
    		node=node.next;
    	}
    }
    
    public static void main(String[] args){
    	QueueLinkedListV2 queueList=new QueueLinkedListV2();
    	queueList.enqueue("1");
    	queueList.enqueue("3");
    	queueList.enqueue("5");
    	queueList.enqueue("7");
    	queueList.enqueue("9");
    	queueList.enqueue("11");
    	
    	queueList.printElement();
    	
    	queueList.dequeue();
    	
    	queueList.printElement();
    }
}
