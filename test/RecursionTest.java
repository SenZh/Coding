import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.zsen.traning.Item;
import org.zsen.traning.Recursion;

public class RecursionTest {
	long start,end;

//	@Test
	public void test_BagProblem() {
		Item[] items=new Item[5];
		items[0]=new Item(4, 3);
		items[1]=new Item(5, 4);
		items[2]=new Item(10, 7);
		items[3]=new Item(11, 8);
		items[4]=new Item(13, 9);
		int space=128;
		long start=System.currentTimeMillis();
//		System.out.println("递归  "+Recursion.bagProblem(space, items)+" time: "+(System.currentTimeMillis()-start));
		long start1=System.currentTimeMillis();
		System.out.println("动态编程  "+Recursion.bagProblemStored(space, items)+" time: "+(System.currentTimeMillis()-start1));
		
	}

	@Test
	public void test_fibonacciSequence()
	{
		Recursion.fibonacciSequence(88);
	}
	@Before
	public void before()
	{
		start=System.currentTimeMillis();
	}
	@After
	public void after()
	{
		end=System.currentTimeMillis();
		System.err.println("time:"+(end-start)+"ms");
	}
}
