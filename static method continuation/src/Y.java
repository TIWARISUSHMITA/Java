class  Y
{
	static int i = test();//initalizer
	public static int test() 
	{
		System.out.println("from test");
		main (null); //main method excuting two times /calling main stmt to main method
		return 100;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main :" +i);
	}
}
/*
main method excuting two times
from test
main : 0
main :100
*/

