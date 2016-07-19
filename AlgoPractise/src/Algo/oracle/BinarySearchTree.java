package Algo.oracle;

import Algo.oracle.Node;

public class BinarySearchTree {

	int h;
	Node rootNode;
	Node lastNode;
	
	public void insert(Node node,int value){
	
		if(rootNode==null){
			rootNode=new Node(value);
			return;
		}
		if(node.getData()>value){
			Node lChild=node.getlChild();
			if(lChild!=null){
				insert(lChild,value);
			}else{
				 System.out.println("  Inserted " + value + " to left of "
				            + node.getData());
				node.setlChild(new Node(value));
			}
		}else{
			Node rChild=node.getrChild();
			if(rChild!=null){
				insert(rChild,value);
			}else{
				 System.out.println("  Inserted " + value + " to right of "
				            + node.getData());
				node.setrChild(new Node(value));
			}
		}
	}
	
	public void printInOrder(Node node) {
	    if (node != null) {
	      printInOrder(node.getlChild());
	      System.out.println("  Traversed " + node.getData());
	      printInOrder(node.getrChild());
	    }
	  }
	
	public static void main(String[] args){
		BinarySearchTree binary=new BinarySearchTree();
		Node node=new Node(3);
		binary.rootNode=node;
		binary.insert(node, 1);
		binary.insert(node, 5);
		binary.insert(node, 7);
		binary.insert(node, 2);
		binary.insert(node, 4);
		binary.printInOrder(node);
	}
}
