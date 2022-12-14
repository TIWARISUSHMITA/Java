class  W
{
	static int i = test();  //iniatilizer
	static int j = test();  //iniatilizer
	public static int test()
	{
		System.out.println("from test : " +i +"," +j);
		return 100 ;	
	}
	public static void main(String[] args) 
	{
		System.out.println("from main : " +i + "," +j);

	}
}
/*
from test : 0,0
from test : 100,0
from main : 100,100
every initializer has to excute from top to bottom then main method

every inializer should excute before main method
if inializers excution got over then only it reads main method


*/