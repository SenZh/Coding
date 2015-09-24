package org.zsen.traning;

public class AdvancedItem {
	public  int num,val,size;
	public boolean isEmpty()
	{
		return num==0?true:false;
	}
	public AdvancedItem(int num,int val,int size)
	{
		this.val=val;
		this.num=num;
		this.size=size;
	}

	public boolean get()
	{
		if(isEmpty())
			return false;
		num--;
		return true;
	}
	public void push()
	{
		num++;
	}
}
