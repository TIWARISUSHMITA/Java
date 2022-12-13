class  Z4
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		 test(true);
		System.out.println("main end : ");
	}
		public static void test(int i)  
	{
		System.out.println("test ");

	}
}
/*
Z4.java:6: error: incompatible types: boolean cannot be converted to int
                 test(true);
                      ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error
*/