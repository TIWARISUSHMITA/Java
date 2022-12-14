class M24
{
	static void test(Byte i) 
	{
		System.out.println("test(Byte)");
	}
	static void test(Integer  i) 
	{
		System.out.println("test(Integer)");
	}
	public static void main(String[] args) 
	{
		byte b = 10;
		test(b);
		System.out.println("done");
	}
}
/*
test(Byter)
done

there is no suitable method to widning it is boxing after boxing it is finding first test method

*/