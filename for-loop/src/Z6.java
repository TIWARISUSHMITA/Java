class Z6
{
	public static void main(String[] args) 
	{
		// int m,n,p;
		System.out.println("main begin");
		int  i =1;
		for ( i = 1, System.out.println("INIT"); test(i) ;i++ ,System.out.println("CHANGE"))   
          
		{
			System.out.println("loop body:" + i); 
			
		}
		System.out.println("main end" +i);
	}
	static boolean test(int i)
	{
	boolean b1 = i<5;
	System.out.println("BOOLEAN CON RESULT FOR" + i + "is :" + b1);
	return b1;
	}

}

