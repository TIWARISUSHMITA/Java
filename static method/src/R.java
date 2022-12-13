class  R
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
		return "hello" ;
	}
}
/**
R.java:16: error: incompatible types: String cannot be converted to int
                return "hello" ;
                       ^
1 error

the test method is int  typt

*/