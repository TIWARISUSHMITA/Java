class  T
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
100 is not returning
it prints when 100 is also present in main 
here main method is totally ignoring the 100 becouse in main mathod the 100 is not declaring in the main methode


*/