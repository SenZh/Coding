package org.zsen.traning;

public class Stack<T>
{
	Snode<T> frist,last,temp;
	public void push(T val)
	{
		if(frist==null)
			frist=last=new Snode<T>(val,null);
		else
		{
			frist.pre=new Snode<T>(val,null);
			frist=frist.pre;
		}
	}
	public T pop()
	{
		if(last==null)
			return null;
		else
		{		
				temp=last;
				last=last.pre;
				if(last==null)
					frist=null;
				return temp.val;
	
		}
	}
	
	public boolean isEmpty()
	{
		return frist==null?true:false;
	}
	private class Snode<T>
	{
		T val;
		Snode<T> pre;
		public Snode(T val,Snode<T> pre)
		{
			this.val=val;
			this.pre=pre;
		}
	}
}