class	K
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		while (i <=5)
		{
			System.out.println("while loop body begin:" + i);
			for (int j = 100 ;j<=103 ; j++ )
			{
				System.out.println("for loop begin : " +i +" ," + j);
				if (j == 101)
				{
					continue ;
				}
				System.out.println("for loop end : " +i +" ," + j);
			}
			System.out.println("while loop body end:" + i); 
			i++ ; 
			
		}
		System.out.println("main end" + i);  
	}
}
/*



*/