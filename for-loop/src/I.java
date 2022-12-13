class I
{
	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		for (int i =1; i <=10 ; i ++ )  
      

		{
			System.out.println("loop begin:" +i);
			if (i <= 6)  
			{
				continue; // it should be last stmt in the current block but is first than stmt if block so error
				System.out.println("if block");
			}
			System.out.println("loop end:" +i);
			System.out.println("============");
		}
		System.out.println("main end");
	}
}
/*
contiunue always shold be last stmt in the current block

I.java:15: error: unreachable statement
                                System.out.println("if block");
                                ^
1 error

in java there are four keyword should be in the last stmt in the current block
(continue ,break ,return , throw)

*/