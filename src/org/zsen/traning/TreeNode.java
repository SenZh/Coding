package org.zsen.traning;

public class TreeNode {
	String val;
	TreeNode left,right;
	public TreeNode()
	{
		
	}
	public TreeNode(String val)
	{
		this.val=val;
	}
	public TreeNode(String val,TreeNode left,TreeNode right)
	{
		this.val=val;
		this.left=left;
		this.right=right;
	}
	@Override
	public String toString() {
		return "TreeNode [val=" + val+"]";
	}
	
}

