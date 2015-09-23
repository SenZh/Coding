package org.zsen.algorithms;

public class LinkedListReverse {
	public static void main(String[] args) {
			Node node=new Node(0);
			node.next=new Node(1).next=new Node(2);
			System.out.println(reverse(node).val);
			
	}
	
	public static Node reverse(Node node)
	{
		if(null==node)
			return null;
		Node pre=null,now=node,next=null;
		while(null!=now.next)
		{
			next=now.next;
			now.next=pre;
			pre=now;
			now=next;
		}
		return now;
	}

}

class Node
{
	int val=0;
	Node next=null;
	public Node(int val)
	{
		this.val=val;
	}
}