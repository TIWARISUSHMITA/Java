class  O
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
			System.out.println("if end");
		}
		
		System.out.println("test end");
	}
}
/**

main begin
main middle
test begin
test middel
if end
test end
main end

*/