class M29
{
	static void test(byte  i) 
	{
		System.out.println("test(byte)");
	}
	static void test(Byte i) 
	{
		System.out.println("test(Byte i)");
	}
	static void test(byte ... i) 
	{
		System.out.println("test(byte ... i)");
	}
	static void test(int i) 
	{
		System.out.println("test(int i)");
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
test(byte)
done

byte is wider then other that is why it prits
*/