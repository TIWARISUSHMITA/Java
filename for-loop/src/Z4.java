class Z4
{
	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		int i=100 ;
		for ( System.out.println("INIT"),i = 1; test(i) ;i++ ,System.out.println("CHANGE"))   
                  

		{
			System.out.println("loop body:" + i); 
			
		}
		System.out.println("main end" +i);
	}
	static boolean test(int i)
	{
	boolean b1 = i<5;
	System.out.println("BOOLEAN CON RESULT FOR" + i +"is :" + b1);
	return b1;
	}

}

