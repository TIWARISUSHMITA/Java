class  L
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
			return ;
		}
		
		System.out.println("test end");
	}
}
/**
return typt is void
when ever is excuted control the 

main begin
main middle
test begin
test middle
main end

*/