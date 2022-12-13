class P
{
	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		if (true)
		{
		   System.out.println("if 1 begin");
		   if (true)
		   { 
			   
		      System.out.println("if 2 begin");
		      if (false)
		     {

			     System.out.println("if 3");
		     }
			   System.out.println("if 2 end");
		  
		}

		System.out.println("if 1 end");
	}
	System.out.println("main end");
	   
	}
}
/*

main begin
if 1 begin
if 2 begin
if 2 end
if 1 end
main end
*/