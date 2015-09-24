package org.zsen.traning;

import org.junit.Test;

public class TreeTest {

	@Test
	public void testTraverse() {
		TreeNode n0=new TreeNode("n0");
		TreeNode n1l=new TreeNode("n1l");
		TreeNode n1r=new TreeNode("n1r");
		n0.left=n1l;
		n0.right=n1r;
		TreeNode n2l=new TreeNode("n2l");
		TreeNode n2r=new TreeNode("n2r");
		n1l.left=n2l;
		n1l.right=n2r;
		Tree.loopTraversePreOrder(n0);
	}

}
