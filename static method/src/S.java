class  S
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main middle");
		test();
		
		System.out.println("main end");
	}
		public static int test()  
	{
		System.out.println("test begin");
		System.out.println("test middle");		
		System.out.println("test end"); 
		return true;
	}
}
/**
S.java:16: error: incompatible types: boolean cannot be converted to int
                return true;
                       ^
1 error


*/