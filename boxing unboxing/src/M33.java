class M33
{
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