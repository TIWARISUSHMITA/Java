class  Z1
{
	static int i = test();//initalizer
	public static int test() 
	{
		System.out.println("from test");
		main (null);
		System.out.println("-----------");
		main (new String[]{});
		System.out.println("-----------");
		main(new String[]{"hello ","xyz"});
		return 100;
	}
	
	public static void main(String[] args) 
	{
		i +=1;
		System.out.println("main :" +i + "," +java.util.Arrays.toString(args));
	}
}
/*
from test
main :0,
----------
main :0:
----------
*/

