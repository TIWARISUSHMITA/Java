//byte < short < int < long < float < double

class  D
{
	public static void main(String[] args) 
	{

		System.out.println("main begun");
		byte b = 20;
		test(b);  //test (int) b;
		System.out.println("main end");
	}
	public static void test(int i)
	{
		System.out.println("test");
	}
}

/*

*/