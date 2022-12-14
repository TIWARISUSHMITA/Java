class  U
{
	static int i = test();  //iniatilizer
	public static int test()
	{
		System.out.println("from test");
		return 100 ;	
	}
	public static void main(String[] args) 
	{
		System.out.println("from main : " +i);

	}
}
/*
from test
from main : 100
every inializer should excute before main method
if inializers excution got over then only it reads main method


*/