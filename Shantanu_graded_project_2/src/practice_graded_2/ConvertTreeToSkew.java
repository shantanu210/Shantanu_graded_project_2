package practice_graded_2;

import java.io.*;

//binary search tree into a skewed tree 

//Class of the node
class Node
{
	int val;
	Node left, right;
	
	// Helper function that allocates a new node with the given data and NULL left and right 
	//pointers.
	Node(int item)
	{
		val = item;
		left = right = null;
	}
}
public class ConvertTreeToSkew {
	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	// Function to to flatten the binary
	// search tree into a skewed tree in
	// increasing / decreasing order
	static void flattenBTToSkewed(Node root)
	{
	
		// Base Case
		if(root == null)
		{
			return;
		}
	
		flattenBTToSkewed(root.left);
		
		Node rightNode = root.right;
		Node leftNode = root.left;
	
		// Condition to check if the root Node
		// of the skewed tree is not defined
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

	// Function to traverse the right skewed tree using recursion
	static void traverseRightSkewed(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);	
	}

	
	public static void main (String[] args)
	{
	
		 ConvertTreeToSkew tree = new ConvertTreeToSkew();
		 tree.node = new Node(50);
	     tree.node.left = new Node(30);
	     tree.node.right = new Node(60);
	     tree.node.left.left = new Node(10);
	     tree.node.right.left= new Node(55);

		
		flattenBTToSkewed(node);
		traverseRightSkewed(headNode);
	}
}
