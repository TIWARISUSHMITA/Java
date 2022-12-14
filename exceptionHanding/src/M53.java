class  M53
{
	static void test() throws ClassNotFoundException
	{
	
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}
/*
M53.java:10: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
                test();
                    ^
1 error
*/
