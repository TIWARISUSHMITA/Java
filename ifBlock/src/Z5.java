class Z5
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
	  if (false)

			System.out.println("if -block-stmt1 " );  
			System.out.println("if -block-stmt2 " ); 
			System.out.println("if -block-stmt3 " ); 
			System.out.println("if -block-stmt4 " ); 
			System.out.println("if -block-stmt5 " ); 
         System.out.println("main end : "); 
	}
}

/*
if there is no opening breces in the if block so the if block is read only first stmt   line no 8
  all lines are excuting except line no 8 becouse of if block and the if block is false

*/