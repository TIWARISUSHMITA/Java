class	M
	{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		outerloop :
		while (i <=5)
		{
			System.out.println("while loop body begin:" + i);
			for (int j = 100 ;j<=103 ; j++ )
			{
				System.out.println("for loop begin : " +i +" ," + j);
				if (j == 101)
				{
					break outerloop ;
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
lebelled loop
in case of labelled loop we give the name of any loop so in here we give the name for  while loop
so when the break condition is satisfyig then it breaks all the loop  and print only the main end which
is part of main body



*/