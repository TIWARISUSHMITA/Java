class  Z6
{

	 static 
	{
		System.out.println("SIB1");
	}
	static int i = test();
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
SIB1
from test
SIB2
SIB3
main

in this first sib1 excute becouse it is also initializer then test then other
initialzer is excuting from top to bottom
so it excute which one is the first 
except main method
*/