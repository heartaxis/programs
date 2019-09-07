package com.programs.random;


public class BinaryTree {

	public static int heightOfTree(Node root) {
		if (null == root)
			return 0;
		int hLeftSub = heightOfTree(root.left);
		int hRightSub = heightOfTree(root.right);
		return Math.max(hLeftSub, hRightSub) + 1;
	}
  

}

 class Node {
	public int data;
	public Node left;
	public Node right;

	public Node(int num) {
		this.data = num;
		this.left = null;
		this.right = null;
	}

	public Node() {
		this.left = null;
		this.right = null;
	}

	public static Node createNode(int number) {
		return new Node(number);
	}
}