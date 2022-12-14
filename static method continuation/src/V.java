class  V
{
	static int i = test();  //iniatilizer
	static int j = test();  //iniatilizer
	public static int test()
	{
		System.out.println("from test");
		return 200 ;	
	}
	public static void main(String[] args) 
	{
		System.out.println("from main : " +i + "," +j);

	}
}
/*
from test
from test
from main : 200,200
every initializer has to excute from top to bottom then main method

every inializer should excute before main method
if inializers excution got over then only it reads main method


*/