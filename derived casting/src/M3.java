class M3 
{
	public static void test1(A obj) 
	{
		System.out.println("from test1");
	}

	public static void test2(D obj) 
	{
		System.out.println("from test2");
	}
	public static void main(String[] args)
	{
		test1(new A());
		System.out.println("----------");
		test2(new D());
		System.out.println("----------");
		D d1 = new D();
		test2(d1);
		System.out.println("----------");
		A a1 = new A();
		test1(a1);
		System.out.println("----------");
	
	}
}
