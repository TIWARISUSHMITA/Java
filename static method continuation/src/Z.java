
0class  Z
{
	static int i = test();//initalizer
	public static int test() 
	{
		System.out.println("from test");
		main (null);
		System.out.println("-----------");
		main (new String[]{});
		return 100;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main :" +i);
	}
}
/*
from test
main :0
-----------
main :0
main :100


in line no 7 means main is excuting with null value 0
then in line no 9 also excuting the min method with
main method calling to empty string arry in line no 9
this is 
and then return 100 in the main method becouse of i
*/

