package org.zsen.algorithms;
/**
 * 
 * @author zhangsen
 * @date 2015年9月22日
 */
public class MathUtils {
	
	/**
	 * 
	 * @desc 最大公约数
	 * @param x
	 * @param y
	 * @return
	 * @date 2015年9月22日
	 * @author zhangsen
	 *
	 */
	public static long GreatestCommonDivisor(long x,long y)
	{
		if(x>=y)
			return gcdloop(x,y);
		else
			return gcdloop(y,x);
	}
	
	/**
	 * 
	 * @desc 判断一个数是不是质数（素数）
	 * @param n
	 * @return result
	 * @date 2015年9月22日
	 * @author zhangsen
	 *
	 */
	public static boolean isPrime(long n) {
	    if (n <= 3) {
	        return n > 1;
	    }
	    if (n % 2 == 0 || n % 3 == 0) {
	        return false;
	    }
	 
	    for (int i = 5; i * i <= n; i += 6) {
	        if (n % i == 0 || n % (i + 2) == 0) {
	            return false;
	        }
	    }
	    return true;
	}

	private static long gcd(long x,long y)
	{
		if(y==0)
			return x;
		return gcd(y,x%y);
	}
	private static long gcdloop(long x,long y)
	{
		long temp_y=y;
		while(x%y!=0)
		{
			temp_y=y;
			y=x%y;
			x=temp_y;
		}
		return y;
		
	}
}
