class W
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i  = 10;
        if(++i  == 11)  // 11== 11 (true)
		{
			System.out.println("if -block-stmt1 "  + i);  //11
			System.out.println("if -block-stmt2 "  + i++);  //11
			i++;  //12
	
		}

		System.out.println("main end : "  +i);  //13
	}
}