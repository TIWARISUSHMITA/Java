class G 
{
	static int test1(short s)
	{
		System.out.println("from test1");
		return s ; // return (int) s;
	}
	static float test2(long s)
	{
		System.out.println("from test1");
		return s ; //return (float) s;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		byte b1 = 10;
		long v1 = test1(b1); //long v1 = ((long) test1 (short) b1);
		System.out.println("-------------");
		double d1 = test2(b1); //doulble d1 = (double )  test2 (long) b1);
		System.out.println("main end");
	}
}
