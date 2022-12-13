class X
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i  = 10;
        if(i++  == i++)  // 10== 11 (false)
		{
			System.out.println("if -block-stmt1 "  + i);  //12
			System.out.println("if -block-stmt2 "  + i++);  //12
			i++;  //13
	
		}

		System.out.println("main end : "  +i);  //12
	}
}
/*
becouse of
10== 11 (false)
the if block is not excuted now the final i value is 12
*/