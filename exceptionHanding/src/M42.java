class M42
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			test();
		}
		catch (ArithmeticException ex)
		{
			System.out.println("from catch");
		}
		System.out.println("main end");
	}
	public static void test()
	{
		System.out.println("test begin");
		int i = 10/0;
		System.out.println("test end");
	}
}
/*
main begin
test begin
from catch
main end

unhandled exception object its handle by propagative
exception not only handling while rising it can be handl propagation also
*/