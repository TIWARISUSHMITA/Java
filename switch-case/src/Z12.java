class  Z12
{
	public static void main(String[] args) 
	{
		int i = 100;
		final int j ;
		j = 100;
		switch (i)
		{
		case j:
			System.out.println("from case test");
			break;

		case 120:
			System.out.println("from case hello");
			break;
		}
		System.out.println("end");
	}
}
/*
constant expression
compiler thinking that j is other
*/