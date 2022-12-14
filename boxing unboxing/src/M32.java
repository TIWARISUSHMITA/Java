class M32
{
	static void test(byte ... i) 
	{
		System.out.println("test(byte ... i)");
	}
	static void test(Object i) 
	{
		System.out.println("test(Object i)");
	}
	public static void main(String[] args) 
	{
		byte b = 10;
		test(b);
		System.out.println("done");
	}
}
/*
test(Object i)
done

*/