package org.zsen.traning;

import java.util.HashMap;
/**
 * @desc 递归
 * @author zhangsen
 * @date 2015年9月23日
 */
public class Recursion {
	
	/**
	 * 
	 * @desc 斐波那契数列
	 * @param n
	 * @date 2015年9月23日
	 * @author zhangsen
	 *
	 */
	public static void fibonacciSequence(long n)
	{
		long[] fKnown=new long[100];
		System.out.println(f_Bottom2Top(n,fKnown));
		
	}
	/**
	 * 
	 * @desc 斐波那契数列,自顶而下，递归,采用动态编程，所消耗时间为线性级
	 * @param n
	 * @date 2015年9月23日
	 * @author zhangsen
	 *
	 */
	private static long f(long x,long[] fknown)
	{
		if(x==0||x==1)
			return x;
		if(fknown[(int) x]!=0)
			return fknown[(int) x];
		fknown[(int) x]=f(x-1,fknown)+f(x-2,fknown);
		return fknown[(int) x];
	}
	public static long f_Bottom2Top(long x,long[] fknown)
	{
		for(int i=0;i<=x;i++)
		{
			if(i==0||i==1)
				fknown[i]=i;
			else
				fknown[i]=fknown[i-1]+fknown[i-2];
		}
		return fknown[(int) x];
	}
	
	/**
	 * 	
	 * @desc 以递归的方式从一个数组找到最大值
	 * @param array
	 * @date 2015年9月22日
	 * @author zhangsen
	 *
	 */
	public static void findMax(long array[])
	{
		System.out.println(array[max(array,0)]);

	}
	private static int max(long array[],int index)
	{
		if(array.length-1==index+1)
		{
			if(array[index]>array[index+1])
				return index;
			else
				return index+1;
		}
		else
		{
		int array_index=max(array,index+1);
		if(array[index]>=array[array_index])
			return index;
		else
			return array_index;
		}
			
		
	}
	
	/**
	 * 
	 * @desc 背包问题，一个固定大小的背包和一系列物品，物品的价值和
	 * 		  所占空间不同，求一个背包所能装物品的最大价值
	 * @param space
	 * @param items
	 * @return
	 * @date 2015年9月22日
	 * @author zhangsen
	 *
	 */
	public static int bagProblem(int space,Item[] items)
	{
		int remain_space=0,max_val=0,temp_val=0;
		for(int i=0;i<items.length;i++)
			if((remain_space=space-items[i].size)>=0)
				if((temp_val=bagProblem(remain_space,items)+items[i].val)>max_val)
					max_val=temp_val;
		return max_val;
	}
	
	public static int bagProblemStored(int space,Item[] items)
	{
		HashMap<String, Integer> maxKnown=new HashMap<String, Integer>(30);
		return bps(space,items,maxKnown);
	}
	/**
	 * 
	 * @desc 同背包问题，采用动态编程,所消耗的时间为线性级
	 * @param space
	 * @param items
	 * @param maxKnown
	 * @return
	 * @date 2015年9月22日
	 * @author zhangsen
	 *
	 */
	private static int bps(int space,Item[] items,HashMap<String, Integer> maxKnown)
	{
		if(maxKnown.containsKey(String.valueOf(space)))
		{
//			System.err.println("found");
			return maxKnown.get(String.valueOf(space)).intValue();
		}
		int remain_space=0,max_val=0,temp_val=0;
		for(int i=0;i<items.length;i++)
			if((remain_space=space-items[i].size)>=0)
				if((temp_val=bps(remain_space,items,maxKnown)+items[i].val)>max_val)
					max_val=temp_val;
		maxKnown.put(String.valueOf(space), Integer.valueOf(max_val));
		return max_val;
	}
	private static Node max(Node node)
	{
		if(node.next==null)
			return node;
		else
		{
			Node next_max=max(node.next);
			if(node.val>next_max.val)
				return node;
			else
				return next_max;
		}
	}
	public static void findMax(Node node)
	{
		System.out.println(max(node).toString());
		
	
	}
	
}

 class Node
{
	public int val;
	public Node next=null;
	public Node(int val)
	{
		this.val=val;
	}
	@Override
	public String toString() {
		return "Node [val=" + val + "]";
	}
	
}
