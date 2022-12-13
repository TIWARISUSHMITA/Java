class Z3
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
	  if (true)
	  {
		  int i = 10;
			System.out.println("if -block-stmt1 "  + i);  
			System.out.println("if -block-stmt2 "  + i++); 
			i++; 
	
		}

		System.out.println("main end : "  +i);   //can not find the symbol i 
	}
}
/*
compile time error becouse i is declare in the if block
whrer as the main i is out side of the if the block
*/
