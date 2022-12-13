class S
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (true)
			if (false)
				System.out.println("if-2-block");
			else
			System.out.println("else -2-block");
	
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

