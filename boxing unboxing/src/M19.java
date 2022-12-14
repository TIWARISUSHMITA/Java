class  M19
{
	static void test(int ... x)   
	{

	}
	static void test(int[] y)
	{
	
	}
	
	
}
/*

M19.java:7: error: cannot declare both test(int[]) and test(int...) in M19
        static void test(int[] y)
                    ^
1 error
both methods have same signature but we can overload var arg element to array element

*/