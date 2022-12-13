class D
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (false)
		{
			System.out.println("if-block-stmt1");
			System.out.println("if-block-stmt2");
		}
		int i = 10;
		else
		{
		System.out.println("else-block-stmt1");
		System.out.println("else-block-stmt2");

		}
		System.out.println("main end");
	}
}
//error else without if block
