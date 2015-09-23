package org.zsen.nowcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		ListNode ln=new ListNode(2);
		System.out.println(printListFromTailToHead(ln));
		
	}
	
	  public static boolean Find(int [][] array,int target) {
		  
		  for(int i=0;i<array.length;i++)
			{
				int index=Arrays.binarySearch(array[i], target);
				if(index<array[i].length&&index>=0)
				if(array[i][index]==target)
					return true;
			}
		  return false;

}
	  public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		  ArrayList<Integer> list=new ArrayList<Integer>();
		  int a[] = new int[100];
		  int index=0;
		  while(listNode!=null)
		  {
			  a[index]=listNode.val;
			  index++;
			  listNode=listNode.next;
		  }
		  for(int i=index-1;i>=0;i--)
		  {
			  list.add(a[i]);
		  }
		return list;
	        
	    }
}
	  
 class ListNode {
    int val;
   ListNode next = null;

   ListNode(int val) {
       this.val = val;
   }
}