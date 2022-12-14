class  M18
{
	static void test(int ... x, String s1)   //(int ... x)var arg means variable number of arguments
	{
		System.out.println("test with var args" + x.length); // here x ia an array
		for (int i : x )
		{
			System.out.println(i); //print arguments
		}
	}
	
}

/*
String s1 is fixed
argsnumber according to number

M18.java:3: error: ')' expected
        static void test(int ... x, String s1)   //(int ... x)var arg means variable number of arguments
                                  ^
M18.java:3: error: ';' expected
        static void test(int ... x, String s1)   //(int ... x)var arg means variable number of arguments
                                             ^
2 errors
*/