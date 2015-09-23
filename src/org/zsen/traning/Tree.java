package org.zsen.traning;

public class Tree {
	public static void traversePreOrder(TreeNode treeNode)
	{
		System.out.println(treeNode.toString());
		if(null!=treeNode.left)
		traversePreOrder(treeNode.left);
		if(null!=treeNode.right)
		traversePreOrder(treeNode.right);
	}
	public static void traverseInOrder(TreeNode treeNode)
	{
		if(null!=treeNode.left)
			traverseInOrder(treeNode.left);
		System.out.println(treeNode.toString());
		if(null!=treeNode.right)
			traverseInOrder(treeNode.right);
		
		
	}
	public static void traversePostOrder(TreeNode treeNode)
	{
		if(null!=treeNode.left)
			traversePostOrder(treeNode.left);
		if(null!=treeNode.right)
			traversePostOrder(treeNode.right);
		System.out.println(treeNode.toString());
	}
}
