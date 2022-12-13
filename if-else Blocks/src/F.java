class F
{
	public static void main(String[] args) 
	{
		int i=10;
		System.out.println("main begin");
		if (false)
		{
			i =i+30;
			System.out.println("if-block-stmt1");
			System.out.println("if-block-stmt2");
		}
	
		else
		{
			i = i+ 60;
		System.out.println("else-block-stmt1");
		System.out.println("else-block-stmt2");

		}
		System.out.println("main end" +i);
	}
}

