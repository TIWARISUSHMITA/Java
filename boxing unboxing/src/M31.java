class M31
{
	static void test(Byte i) 
	{
		System.out.println("test(Byte i)");
	}
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
test(Byte i)
done

throuh widning it is not finiding the suuitable method that is why it is gining to boxing
*/