class M39 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main end");
	}
	public static void test()
	{
		System.out.println("test begin");
		int i = 10/0;
		System.out.println("test end");
	}
}
/*
main begin
main end
*/