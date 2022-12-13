class Z11
{
	public static void main(String[] args)
	{
		System.out.println("main begin");

		for (int i = 1; i<=5 ;i++ )

		{
		
			System.out.println("loop begin with : " + i);
			for (int j = 100; j <= 103 ;j++ )
			{
				System.out.println("loop 2 begin with : "+ i + "," +j);
				System.out.println("loop 2 end with : "+ i + "," +j);
			}
		 	System.out.println("loop1 end with : " + i);
		
		}
		
		System.out.println("main end");
	
	}
}
