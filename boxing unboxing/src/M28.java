class M28
{
	static void test(Integer  i) 
	{
		System.out.println("test(Integer)");
	}
	static void test(byte ... i) 
	{
		System.out.println("test(byte ... i)");
	}
	public static void main(String[] args) 
	{
		byte b = 10;
		test(b);
		System.out.println("done");
	}
}
/*
test(byte ... i)
done

*/