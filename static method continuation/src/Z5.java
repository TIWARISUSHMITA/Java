class  Z5
{
	static int i = test();
	 static 
	{
		System.out.println("SIB1");
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
	}	
	static  
	{
		System.out.println("SIB2");
	}
	static int test()
	{
		System.out.println("from test");
		return 100;
	}
	static  
	{
		System.out.println("SIB3");
	}

}
/*
from test
SIB1
SIB2
SIB3
main

once initializer got over then main method excutes
but if test method is present sp it excute first then other
*/