class	I
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		while (i <=5)
		{
			System.out.println("while loop body begin:" + i);
			if (i >=3)
			{
				i++ ;
				break ;
			}
			System.out.println("while loop body end:" + i); 
			i++ ; 
			
		}
		System.out.println("main end" + i);  
	}
}
/*

in break condition line no 15 and 16 will not excute becouse break
so the loop is working only 3 then i value is 4 and break all the while block


*/