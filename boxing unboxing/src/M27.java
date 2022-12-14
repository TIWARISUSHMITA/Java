class M27
{
	static void test(Integer  i) 
	{
		System.out.println("test(Integer)");
	}
	static void test(Object  i) 
	{
		System.out.println("test(Object)");
	}
	public static void main(String[] args) 
	{
		byte b = 10;
		test(b);
		System.out.println("done");
	}
}
/*
test(Object)
done

Object is super class to Number
preferinig to number 
autowidning

*/