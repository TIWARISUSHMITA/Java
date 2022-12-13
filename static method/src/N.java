class  N
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main maiddle");
		test();
		
		System.out.println("main end");
	}
		public static void test() 
	{
		System.out.println("test begin");
		System.out.println("test maiddle");
		if (true)
		{
			return  ;  //it should be last but it is above of the below stmt
			System.out.println("if end");
		}
		
		System.out.println("test end");
	}
}
/**

return should be not proper it will keep on last stmt in the block 
compile time error

*/