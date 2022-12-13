class  M
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main middle");
		test();
		
		System.out.println("main end");
	}
		public static void test() 
	{
		System.out.println("test begin");
		System.out.println("test middle");
		if (true)
		{
			return "Hello" ;
		}
		
		System.out.println("test end");
	}
}
/**
return type is void but the return value is "hello" so compile time error
and "hello" is the String type
when ever is excuted control the 




*/