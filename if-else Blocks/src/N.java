class N
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (false)
		{
			System.out.println("if-block-begin");
			if (true)
			{
				System.out.println("if-2-block");

			}
			else
			{
			System.out.println("else -2-block");
			}
			System.out.println("if-1-block end");
		}
	
		else
		{
		   System.out.println("else-1-block");
		}
		
         System.out.println("main end" );
	}
}
/*
main begin
else -1-block
main end
*/

