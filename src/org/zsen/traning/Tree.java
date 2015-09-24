package org.zsen.traning;

import java.util.Random;

/**
 * @desc 树
 * @author zhangsen
 * @date 2015年9月24日
 */
public class Tree {
	/**
	 * 
	 * @desc 递归前序遍历树
	 * @param treeNode
	 * @date 2015年9月24日
	 * @author zhangsen
	 *
	 */
	public static void traversePreOrder(TreeNode treeNode)
	{
		System.out.println(treeNode.toString());
		if(null!=treeNode.left)
		traversePreOrder(treeNode.left);
		if(null!=treeNode.right)
		traversePreOrder(treeNode.right);
	}
	/**
	 * 
	 * @desc  递归中序遍历树
	 * @param treeNode
	 * @date 2015年9月24日
	 * @author zhangsen
	 *
	 */
	public static void traverseInOrder(TreeNode treeNode)
	{
		if(null!=treeNode.left)
			traverseInOrder(treeNode.left);
		System.out.println(treeNode.toString());
		if(null!=treeNode.right)
			traverseInOrder(treeNode.right);
		
		
	}
	
	/**
	 * 
	 * @desc  递归后序遍历树
	 * @param treeNode
	 * @date 2015年9月24日
	 * @author zhangsen
	 *
	 */
	public static void traversePostOrder(TreeNode treeNode)
	{
		if(null!=treeNode.left)
			traversePostOrder(treeNode.left);
		if(null!=treeNode.right)
			traversePostOrder(treeNode.right);
		System.out.println(treeNode.toString());
	}
	
	/**
	 * 
	 * @desc 采用栈前序遍历树
	 * @param treeNode
	 * @date 2015年9月24日
	 * @author zhangsen
	 *
	 */
	public static void loopTraversePreOrder(TreeNode treeNode)
	{
		Stack<TreeNode> stack=new Stack<TreeNode>();
		stack.push(treeNode);
		while(!stack.isEmpty())
		{
			treeNode=stack.pop();
			System.out.println(treeNode.toString());
			if(treeNode.right!=null)
				stack.push(treeNode.right);
			if(treeNode.left!=null)
				stack.push(treeNode.left);
			Random rm=new Random();
		}
	}


}


