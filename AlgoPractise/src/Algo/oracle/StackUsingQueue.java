package Algo.oracle;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue<E> {

	Queue<E> queue=null;
	Queue<E> queue1=null;
	
	public StackUsingQueue(){
		queue=new LinkedList<E>();
		queue1=new LinkedList<E>();
	}
	/**
	 * remove object
	 * */
	public void pop(){
		if(!queue.isEmpty()){
			queue.poll();
		}else if(!queue1.isEmpty()){
			queue1.poll();
		}
	}
	/**
	* insert object
	*/
	public void push(E obj){
		//queue1.add(obj);
		int size=queue.size();
		int newSize=queue1.size();
		if(newSize==0 && size==0){
			queue.offer(obj);
		}
		if(size>0){
			queue1.offer(obj);
			while(size>0){
				queue1.offer(queue.poll());
				size--;
			}
			
		}else if(newSize>0){
			queue.offer(obj);
			while(newSize>0){
				queue.offer(queue1.poll());
				newSize--;
			}
			
		}
		
		
	}
	
	public E top(){
		E obj=null;
		if(!queue.isEmpty()){
			obj=queue.peek();
		}else if(!queue1.isEmpty()){
			obj= queue1.peek();
		}
		return obj;
	}
	
	public boolean empty(){
		boolean isEmpty=false;
		if(queue1.size()>0 && queue.size()>0){
			isEmpty=true;
		}
		return isEmpty;
	}
	
	public int size(){
		int size=0;
		if(queue.size()>queue1.size()){
			size= queue.size();
		}else{
			size=queue1.size();
		}
		return size;
	}
	
	public void printStackEntries(){
		System.out.println(Arrays.toString(queue.toArray()));
	}
	
	
	public static void main(String[] args){
		StackUsingQueue<Integer> stack=new StackUsingQueue<Integer>();
		Integer test1=new Integer(8);
		Integer test2=new Integer(9);
		Integer test3=new Integer(2);
		Integer test4=new Integer(3);
		
		stack.push(test1);
		System.out.println(stack.top());
		stack.push(test2);
		System.out.println(stack.top());
		stack.push(test3);
		System.out.println(stack.top());
		System.out.println(stack.size());
		stack.printStackEntries();
		stack.pop();
		System.out.println(stack.size());
		stack.printStackEntries();
		stack.pop();
		System.out.println(stack.size());
		stack.printStackEntries();
		
		
	}
	
}
