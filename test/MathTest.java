import org.junit.Test;
import org.zsen.algorithms.MathUtils;

public class MathTest {

	@Test
	public void test() {
		long start=System.currentTimeMillis();
		System.out.println(MathUtils.GreatestCommonDivisor(Long.MAX_VALUE, 515111));
		System.out.println(System.currentTimeMillis()-start);
	}

}
