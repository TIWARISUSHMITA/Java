class B 
{
	void test()
	{
		System.out.println("test");
	}
	public static void main(String[] args) 
	{
		System.out.println(" main begin");
		test();
		System.out.println(" main end");
	}
}
/*
compile time error
non static member can not using in static member

*/