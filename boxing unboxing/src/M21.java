class M21
{
	static void test(int i)
	{
		System.out.println("test(int)");
	}
	static void test(byte i)
	{
		System.out.println("test(byte)");
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

auto widning
if exzect suitable method is presenting then no widning,autoboxing

*/