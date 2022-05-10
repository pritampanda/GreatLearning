package com.learning.main;
class Node
{
	int val;
	Node left, right;
	
	Node(int item)
	{
		val = item;
		left = right = null;
	}
}

class SkewedTree
{
	public Node node;
	public Node prevNode = null;
	public Node headNode = null;
	void flattenBTToSkewed(Node root)
	{
	
		// Base Case
		if(root == null)
		{
			return;
		}
	
		
			flattenBTToSkewed(root.left);
		
		Node rightNode = root.right;
		Node leftNode = root.left;
	
		if(headNode == null)
		{
			headNode = root;
			root.left = null;
			prevNode = root;
		}
		else
		{
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
	
		
			flattenBTToSkewed(rightNode);
		
	}
	void traverseRightSkewed(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);	
	}
}

public class Driver {
	
		public static void main (String[] args)
		{
			SkewedTree tree = new SkewedTree();
			tree.node = new Node(50);
			tree.node.left = new Node(30);
			tree.node.right = new Node(60);
			tree.node.left.left = new Node(10);
			tree.node.right.left= new Node(40);
			tree.flattenBTToSkewed(tree.node);
			tree.traverseRightSkewed(tree.headNode);
		}
		
		
	}