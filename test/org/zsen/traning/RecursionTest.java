package org.zsen.traning;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.zsen.traning.Item;
import org.zsen.traning.Recursion;

public class RecursionTest {
	private long start;

//	@Test
	public void test_BagProblem() {
		Item[] items=new Item[3];
		items[0]=new Item(5, 5);
		items[1]=new Item(2, 1);
		items[2]=new Item(3, 2);
		System.out.println(Recursion.bagProblem(19, items));
		
	}
	
	@Test
	public void test_MoneyProblem()
	{
		Item[] items=new Item[5];
		items[0]=new Item(4, 3);
		items[1]=new Item(5, 4);
		items[2]=new Item(10, 7);
		items[3]=new Item(11, 8);
		items[4]=new Item(13, 9);
		HashMap<String, String> stored=new HashMap<String, String>();
		System.out.println(Recursion.bagProblemAdvanced(items, 17, stored));
		System.out.println(stored.toString());
	}
	@Before
	public void before()
	{
		start=System.currentTimeMillis();
	}

	@After
	public void after()
	{
		System.err.println(System.currentTimeMillis()-start+"ms");
	}
}
