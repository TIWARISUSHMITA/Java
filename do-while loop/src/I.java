class I
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		do
		{
		
			System.out.println("do -while : " +i);
			int j = 10;
			while (j <= 13)
			{
				System.out.println("while begin : " +i+"," + j);
				if (j == 11)
				{
					break ;
				}
				System.out.println("while end : " +i+"," + j);
				j++ ; 
			}
			System.out.println("do while end :  : " +i);
			
		}
		while (i++ <= 5 );
		System.out.println("main end : " +i);
	}
}

/*

nested loop
loop iside a loop 
it can be any type of loop


*/