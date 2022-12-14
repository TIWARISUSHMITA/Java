class M30
{
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
test(int)
done

int is wide than others
*/