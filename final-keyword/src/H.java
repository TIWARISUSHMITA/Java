class  H
{
	public static void test(int i , final int j, int k) 
	{
		i = 10;
		j = 10;
		k = 10;
		System.out.println("Hello World!");
	}
}
/*
H.java:6: error: final parameter j may not be assigned
                j = 10;
                ^
1 error
*/
