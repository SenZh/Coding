package org.zsen.traning;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BagProblemTest {

	private long start;
//	@Test
	public void testFind() {
		BagProblem bp=new BagProblem();
		Item[] items=new Item[5];
		items[0]=new Item(4, 3);
		items[1]=new Item(5, 4);
		items[2]=new Item(10, 7);
		items[3]=new Item(11, 8);
		items[4]=new Item(13, 9);
		bp.setItems(items);
		bp.find(1);		
	}
	@Before
	public void before()
	{
		start=System.currentTimeMillis();
	}

	@After
	public void after()
	{
		System.err.println("this test consumed "+(System.currentTimeMillis()-start)+"ms");
	}
	
	@Test
	public void testFindAdvancedItems()
	{
		BagProblem bp=new BagProblem();
		AdvancedItem[] i=new AdvancedItem[3];
		i[0]=new AdvancedItem(1, 1, 1);
		i[1]=new AdvancedItem(2, 1, 1);
		i[2]=new AdvancedItem(10, 2, 1);
		bp.setAitems(i);
		bp.findAdvancedItems(100);
		
	}
}
