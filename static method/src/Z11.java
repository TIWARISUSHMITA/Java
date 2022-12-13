class Z11
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(100,4.5);
		System.out.println("main end");
	}	
	public static void test(int i, double i) //i is declaring two times
	{
		System.out.println("test:" +i+","+i);
	}
}
/**
 i is declarin  two times
 no matter data type is changing are not but two argument should not have same 
 compilation error
                                         
*/