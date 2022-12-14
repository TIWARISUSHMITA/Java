class  M55A
{
	static void test1() throws ClassNotFoundException
	{
	
	}

	static void test2() throws NullPointerException
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
M55A.java:15: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
                test1();
                     ^
1 error
*/
