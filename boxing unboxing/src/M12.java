class M12 
{
	static void test(int i)
	{
		System.out.println("test");
	}
	public static void main(String[] args) 
	{
		Integer obj = new Integer(100);
		test(obj); //test(obj).intValue());
		System.out.println("done");
	}
}
/*

if the code is in the JDK1.4 then it will occuring the error
but after JDK1.5 it was updated
that is why it compiles success ang running also
*/