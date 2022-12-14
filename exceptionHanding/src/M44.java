class M44
{
	static void test1()
	{
		System.out.println("test1 begin");
		try
		{
			Class.forName("");
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println("ffrom catch");
		}
		System.out.println("test1 end");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("main end");
	}
}
/*
in case of  checked exception go for try-catch or throws
through throws we are handling the exception in the test1

main begin
test1 begin
ffrom catch
test1 end
main end

*/
