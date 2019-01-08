package com.leetcode.string.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.tree.TreeNode;

import com.mentorpick.binarytree.TreeRoot;

public class BinaryTreePath {
	public List<String> binaryTreePaths(TreeRoot root) {
		List<String> paths = new ArrayList<>();
		if (root != null) {
			dfs(root, new StringBuilder(), paths);
		}
		return paths;
	}

	public void dfs(TreeRoot root, StringBuilder str, List<String> paths) {
		int len = str.length();
		str.append("->" + root.val);

		if (root.left == null && root.right == null) {
			paths.add(new String(str.substring(2)));
			// remove the leaf when it has visited.
			str.delete(len, str.length());
			return;
		} else {

			if (root.left != null) {
				dfs(root.left, str, paths);
			}

			if (root.right != null) {
				dfs(root.right, str, paths);
			}
		}
		// remove the parent.
		str.delete(len, str.length());
	}

	public static void main(String[] args) {
		BinaryTreePath path = new BinaryTreePath();
		TreeRoot root = new TreeRoot(1);
		TreeRoot root2 = new TreeRoot(2);
		TreeRoot root3 = new TreeRoot(3);
		root.left = root2;
		root.right = root3;
		TreeRoot root5 = new TreeRoot(5);
		 root2.right = root5;
		List<String> pp = path.binaryTreePaths(root);
		for (String str : pp)
			System.out.println(str);

	}
}
