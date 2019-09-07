package com.practice.programs.random;

public class HeightBinaryTree {
	public static void main(String[] args) {
		// root level 0
		Node A = Node.createNode(11);
		// Level 1
		Node B = Node.createNode(2);
		Node C = Node.createNode(5);
		// Level 2
		Node D = Node.createNode(6);
		Node E = Node.createNode(15);
		Node F = Node.createNode(14);
		Node G = Node.createNode(13);
		// Level 3

		// connect Level 0 and 1
		A.left  = B;
		A.right = C;
		// connect level 1 and level 2
		B.left  = D;
		B.right = E;
		C.left  = F;
		C.right = G;
		// connect leve

		int height = BinaryTree.heightOfTree(A);
		if (height > 0) {
			System.out.println("Height of a Binary Tree is : " + height);
		}
	}
}
