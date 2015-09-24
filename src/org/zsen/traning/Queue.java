package org.zsen.traning;
public class Queue<T> {
	Qnode<T> frist,temp;
	public void put(T val)
	{
		if(frist==null)
			frist=new Qnode<T>(val, null);
		else
			frist=new Qnode<T>(val, frist);
		
	}
	
	public T get()
	{
		if(frist==null)
			return null;
		temp=frist;
		frist=frist.next;
		return temp.val;
	}
	public boolean isEmpty()
	{
		return frist==null?true:false;
	}
	private class Qnode<T>
	{
		T val;
		Qnode<T> next;
		public Qnode(T val,Qnode<T> next)
		{
			this.val=val;
			this.next=next;
		}
	}
}
