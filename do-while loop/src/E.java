class E
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		do
		{
		
			System.out.println("do -while : " +i);
			if (i ==3)
			{
				continue ; 
			}
			System.out.println("do while end :  : " +i);
			i++ ;
		}
		while (i <= 5 );
		System.out.println("main end : " +i);
	}
}

/*
in case while loop and do -while changes should be before continue
infinite loop


*/