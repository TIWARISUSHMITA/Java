class V
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i  = 10;
        if(i++  == 11)  // 10 == 11 (false)
		{
			System.out.println("if -block-stmt1 "  + i);  //11
			System.out.println("if -block-stmt2 "  + i++);  //11
			i++;  //12
	
		}

		System.out.println("main end : "  +i);  //11
	}
}
/* if block is false so it not excuted and the final value is 11

*/