class M26
{
	static void test(Integer  i) 
	{
		System.out.println("test(Integer)");
	}
	static void test(Number  i) 
	{
		System.out.println("test(Number)");
	}
	public static void main(String[] args) 
	{
		byte b = 10;
		test(b);
		System.out.println("done");
	}
}
/*
test(Number)
done

preferinig to number 
autowidning

*/