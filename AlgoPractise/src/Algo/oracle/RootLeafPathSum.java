package Algo.oracle;

public class RootLeafPathSum {
	
	
	
	public boolean hasSum(Node node, int sum){
		boolean hasSum=false;
		int rootSum=node.getData();
		hasSum=hasLeafNode(node,sum,rootSum);
		
		return hasSum;
	}
	
	private boolean hasLeafNode(Node node,int sum,int rootSum){
		boolean found=false;
			Node lNode=node.getlChild();
			if(lNode!=null){
				int newsum=rootSum+lNode.getData();
				found=hasLeafNode(lNode, sum,newsum);
			}else{
				if(rootSum==sum){
					return true;
				}
			}
			Node rNode=node.getrChild();
			if(!found && rNode!=null){
				int newsum=rootSum+rNode.getData();
				found=hasLeafNode(rNode, sum,newsum);	
			}else{
				if(rootSum==sum){
					return true;
				}
			}
		return found;
	}
	


	public static void main(String[] args){
		BinarySearchTree binary=new BinarySearchTree();
		Node node=new Node(2);
		binary.rootNode=node;
		binary.insert(node, 3);
		binary.insert(node, 1);
		RootLeafPathSum pathSum=new RootLeafPathSum();
		boolean found=pathSum.hasSum(binary.rootNode,51);
		System.out.println(found);
		binary.printInOrder(node);
	}
	
}
