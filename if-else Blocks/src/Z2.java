class Z2
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (true)
		{
			if (false)
				if (true)
						System.out.println("if-3-block");
				else
				System.out.println("else-3-bloock");
				
			else
			System.out.println("else -2-block");
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
else -2-block
main end
*/

