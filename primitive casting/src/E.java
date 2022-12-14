//byte < short < int < long < float < double

class  E
{
	public static void main(String[] args) 
	{

		System.out.println("main begun");
		byte b = 20;
		test(b);  //test (int) b;
		short s= 20;
		test(s);
		int i = 20;
		test(i);
		long j = 20;
		test(j);
		System.out.println("main end");
	}
	public static void test(int i)
	{
		System.out.println("test");
	}
}

/*

*/