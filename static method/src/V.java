class  V
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main middle");
		int s1 = test();
		
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
main begin
main middle
test begin
test middle
test end
main end


*/