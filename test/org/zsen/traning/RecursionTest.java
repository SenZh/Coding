package org.zsen.traning;
import org.junit.Test;
import org.zsen.traning.Item;
import org.zsen.traning.Recursion;

public class RecursionTest {

	@Test
	public void test_BagProblem() {
		Item[] items=new Item[3];
		items[0]=new Item(5, 5);
		items[1]=new Item(2, 1);
		items[2]=new Item(3, 2);
		System.out.println(Recursion.bagProblem(19, items));
		
	}

}
