class M43 
{
	static void test1()
	{
		System.out.println("test1 begin");
		Class.forName(""); //compilation error
		System.out.println("test1 end");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("main end");
	}
}
/*
in case of  checked exception go for try-catch or throws
*/
