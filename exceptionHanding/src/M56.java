class  M56
{
	static void test1() throws Throwable
	{
	
	}

	static void test2() throws Exception
	{
	
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		test2();
		System.out.println("main end");
	}
}
/*
M56.java:15: error: unreported exception Throwable; must be caught or declared to be thrown
                test1();
                     ^
M56.java:16: error: unreported exception Exception; must be caught or declared to be thrown
                test2();
                     ^
2 errors
both are acting as a checked

*/
