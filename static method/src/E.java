class  E
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(); //method calling stmt
		System.out.println("---------");	
		test(); //method calling stmt	
		System.out.println("----------");
		test(); //method calling stmt
		System.out.println("main end");
	}
	public static void test() 
	{
		System.out.println("test()");
	}

}
/**
main begin
test()
-------
test()
-------
test()
main end


*/
