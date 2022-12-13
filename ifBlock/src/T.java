class T
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i  = 10;
        if(i  = 10)  // 10 = 10 (true)
		{
		System.out.println("if -block-stmt1");
		System.out.println("if -block-stmt2");
		System.out.println("if -block-stmt3");
		System.out.println("if -block-stmt4");
		}

		System.out.println("main end : "  +i);
	}
}
/*  compile time error becouse i is assigning the value not compair
i is sending an argument as an if block
*/