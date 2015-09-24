package org.zsen.traning;

import java.util.HashMap;

/**
 * @desc 背包问题，一个固定大小的背包和一系列物品，物品的价值和
 * 		  所占空间不同，求一个背包所能装物品的最大价值
 * @author zhangsen
 * @date 2015年9月24日
 */
public class BagProblem {
	private Item[] items;
	private HashMap<String ,Integer> maxKnown;	private HashMap<String, String>  itemKnown;
	private AdvancedItem[] aitems;
	
	/**
	 * 
	 * @desc 背包问题，物品数量无限制
	 * @param space
	 * @date 2015年9月24日
	 * @author zhangsen
	 *
	 */
	public void find(int space)
	{
		if(items==null)
			throw new IllegalArgumentException("items is null");	
		int max=findMax(space);
		System.out.println("max value is : "+max);
		if(itemKnown.containsKey(String.valueOf(max)))
		{
		String itemStr=itemKnown.get(String.valueOf(max));
		System.out.println("items are "+itemStr.substring(0, itemStr.length()-1));
		}
	}
	private int findMax(int space)
	{
		if(maxKnown.containsKey(String.valueOf(space)))  //先从map中找占用空间为spcae的结果
			return maxKnown.get(String.valueOf(space)).intValue(); //返回结果
		int temp_max=0,max=0,remain_space=0;
		for(int i=0;i<items.length;i++)  //开始循环 
			if((remain_space=space-items[i].size)>=0) //是否超出最大空间
				if((temp_max=findMax(remain_space)+items[i].val)>max)  //加上当前物品的价值是否大于最大值
				{
					max=temp_max;
					if(itemKnown.containsKey(String.valueOf(max-items[i].val)))  //判断在已知物品map中是否有价值为max-items[i].val的key存在
						itemKnown.put(String.valueOf(max), itemKnown.get(String.valueOf(max-items[i].val))+i+"-"); 
					else
						itemKnown.put(String.valueOf(max), String.valueOf(i+"-"));
				}
		maxKnown.put(String.valueOf(space), Integer.valueOf(max));//在map中记录当前空间对应的最大价值
		return max;
	}
	/**
	 * 
	 * @desc 背包问题，物品有数量限制
	 * @param space
	 * @date 2015年9月24日
	 * @author zhangsen
	 *
	 */
	public void findAdvancedItems(int space)
	{
		if(aitems==null)
			throw new IllegalArgumentException("items is null");	
		int max=findMaxAitems(space);
		System.out.println("max value is : "+max);
		if(itemKnown.containsKey(String.valueOf(max)))
		{
		String itemStr=itemKnown.get(String.valueOf(max));
		System.out.println("items are "+itemStr.substring(0, itemStr.length()-1));
		}
	}
	private int findMaxAitems(int space)
	{
		if(maxKnown.containsKey(String.valueOf(space)))
			return maxKnown.get(String.valueOf(space)).intValue();
		int temp_max=0,max=0,remain_space=0;
		for(int i=0;i<aitems.length;i++)
		{
			if(aitems[i].isEmpty()) //当前物品是否还有剩余
				continue;
			if((remain_space=space-aitems[i].size)>=0)
			{
				aitems[i].get(); //取出一个物品，物品剩余数量-1
				if((temp_max=findMaxAitems(remain_space)+aitems[i].val)>max)
				{
					max=temp_max;
					if(itemKnown.containsKey(String.valueOf(max-aitems[i].val)))
						itemKnown.put(String.valueOf(max), itemKnown.get(String.valueOf(max-aitems[i].val))+i+"-");
					else
						itemKnown.put(String.valueOf(max), String.valueOf(i+"-"));
				}
				else //不符合条件，把物品再放回
					aitems[i].push();
					
			}
		}
		maxKnown.put(String.valueOf(space), Integer.valueOf(max));
		return max;
	}
	
	
	public AdvancedItem[] getAitems() {
		return aitems;
	}
	public Item[] getItems() {
		return items;
	}
	
	public void setAitems(AdvancedItem[] items) {
		maxKnown =new HashMap<String, Integer>();
		itemKnown =new HashMap<String, String>();
		this.aitems = items;
	}
	public void setItems(Item[] items) {
		maxKnown =new HashMap<String, Integer>();
		itemKnown =new HashMap<String, String>();
		this.items = items;
	}

}
