class M41
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
	public static void test()
	{
		System.out.println("test begin");
		try
		{
			int i = 10/0;
		}
		catch (ArithmeticException ex)
		{
			System.out.println("from catch");
		}
		
		System.out.println("test end");
	}
}
/*
main begin
test begin
from catch
test end
main end
*/