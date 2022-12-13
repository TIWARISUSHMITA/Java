class M
{
	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		for (int i =3; i <=10 ; i ++ )  
      

		{
			System.out.println("loop body:" +i);
		}
		System.out.println("main end" +i);
	}
}
/*
M.java:13: error: cannot find symbol
                System.out.println("main end" +i);
                                               ^
  symbol:   variable i
  location: class M
1 error
here i is the initializion portion for the for loop

*/