package Algo.oracle;


/**
 * program to demostrate removing duplicates from linkedlist
 * */

public class RemoveDuplicateFromSortedLL<Node> {

	public static int INITIAL_COUNT=10;
	Node head=null;
	Node last=null;
	int count=0;
	
	public RemoveDuplicateFromSortedLL(){
		head=new Node(null);
		count=0;
	}
	
	public void add(String data){
		Node rootNode=head;
		while(rootNode.getNext()!=null){
			rootNode=rootNode.getNext();
		}
		Node newNode=new Node(data);
		rootNode.setNext(newNode);
		last=newNode;
		if(count<10){
			count++;
		}
		
	}
	
	public boolean remove(int index){
		boolean isRemoved=false;
		if(index>INITIAL_COUNT){//throw exception;
			return isRemoved;
		}
		Node current=head;
		for(int i=0;i<index;i++){
			if(current.getNext()==null){
				break;
			}else{
				current=current.getNext();
			}
			
		}
		current.setNext(current.getNext().getNext());
		count--;
		
		return isRemoved;
	}
	
	
	public int size(){
		return count;
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
	/**
	 * move both the nodes, move current node only if there is no equal values.
	 * */
	public void removeDuplicates(){
		if(head.getNext()!=null){
			Node current=head;
			Node nextNode=head.getNext();
			
			while(nextNode!=null){
				if(current.getData()!=null && current.getData().equals(nextNode.getData())){
					nextNode=nextNode.getNext();
					current.setNext(nextNode);
				}else{
					current=nextNode;
					nextNode=nextNode.getNext();
				}
			}
		}
	}
	
	public String toString()
	{
		Node current = head.getNext();
		String output = "";
		while(current != null)
		{
			output += "[" + current.getData().toString() + "]";
			current = current.getNext();
		}
		return output;
	}
	
	public static void main(String[] args){
		RemoveDuplicateFromSortedLL<RemoveDuplicateFromSortedLL.Node> list=new RemoveDuplicateFromSortedLL<RemoveDuplicateFromSortedLL.Node>();
		list.add("11");
		list.add("11");
		list.add("11");
		list.add("21");
		list.add("43");
		list.add("43");
		list.add("60");
		
		//System.out.println(list.toString());
		//list.remove(2);
		//System.out.println(list.toString());
		list.removeDuplicates();
		System.out.println(list.toString());
		
	}
	
}
