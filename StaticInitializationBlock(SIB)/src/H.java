class H 
{
	int i ; //instance variable 
	void test()
	{
		System.out.println("test");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		H obj = new H();
		System.out.println(obj.i);
		obj.test();
		System.out.println("-------");
		obj.i = 20;
		System.out.println(obj.i);
		obj.test();
		System.out.println("main end");
	}
}
/*
main begin
0
test
-------
20
test
main end
i and test both are loading to main memory
in the main method we can acesse any of the object

*/