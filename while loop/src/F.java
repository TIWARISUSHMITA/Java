class	F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		while (i <=5)
		{
			System.out.println("while loop body begin:" + i);
			if (i ==3)
			{
				continue ;
			}
			System.out.println("while loop body end:" + i); 
			i++ ; 
			
		}
		System.out.println("main end" +i);  
	}
}
/*
infinte loop
becouse of 
line no 14 and 15 is not excute becouse of continue in the i ==3 condition and ging to directly next iteration
and in this case increment is also skip which is line no 15



*/