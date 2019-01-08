package com.leetcode.string.easy;

import com.mentorpick.binarytree.TreeRoot;

public class Tree2String {
	public String tree2str(TreeRoot t) {
        if(t==null)
            return null;
        StringBuilder str=new StringBuilder();
        return buildString(t,str);
    }
    // "1(2(4))(3)"
    public String buildString(TreeRoot node,StringBuilder buildOutput){
        if(node==null)
            return null;
      
        buildOutput.append(node.val);
        buildOutput.append("(");
        String strLeft=buildString(node.left,buildOutput);
    
        	buildOutput.append(")");
        buildOutput.append("(");
        String strRight=buildString(node.right,buildOutput);
        if(strRight==null){
        	buildOutput.deleteCharAt(buildOutput.lastIndexOf("("));
        	if(strLeft==null){
        		int idx=buildOutput.lastIndexOf("()");
        		buildOutput.delete(idx,idx+2);
        	}
        }else{
        	buildOutput.append(")");
        }
        return buildOutput.toString();
    }
    
    public static void main(String[] args) {
    	   TreeRoot root=new TreeRoot(1);
    	    TreeRoot lRoot=new TreeRoot(2);
    	    TreeRoot rRoot=new TreeRoot(3);
    	    root.left=lRoot;
    	    root.right=rRoot;
    	    TreeRoot llRoot=new TreeRoot(4);
    	    lRoot.left=llRoot;
    	    Tree2String tree2String=new Tree2String();
    	    System.out.println(tree2String.tree2str(root));
	}
}
