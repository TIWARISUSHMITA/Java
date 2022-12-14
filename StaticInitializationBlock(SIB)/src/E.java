class E 
{
	void test1()
	{
		System.out.println("test1()");
	}
	static void test2()
	{
		test1();
	}
}
/*
non static1 can not be use in test2
*/
