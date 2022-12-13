class  U
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main middle");
		String s1 = test();
		
		System.out.println("main end");
	}
		public static int test()  
	{
		System.out.println("test begin");
		System.out.println("test middle");		
		System.out.println("test end"); 
		return 100;
	}
}
/**
U.java:7: error: incompatible types: int cannot be converted to String
                String s1 = test();
                                ^
1 error

int is reciving a value String
data types are very importent 


*/