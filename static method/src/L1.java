class  L1
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main middle");
		test();
		
		System.out.println("main end");
	}
	public static int test() 
	{
		System.out.println("test begin");
		System.out.println("test middle");
		if (true)
		{
			return ;
		}
		
		System.out.println("test end");
	}
}
/**

L1.java:17: error: incompatible types: missing return value
                        return ;
                        ^
1 error
*/