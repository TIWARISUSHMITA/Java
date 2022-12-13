class Z5
{
	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		int  i =1,j=5 , k =  50;
		for (int i = 1, System.out.println("INIT"); test(i) ;i++ ,System.out.println("CHANGE"))   
         // one time data type then any number of variables
		//if thw firest one is int then after the (,)
 //it is required to to second value is also in int form         
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

