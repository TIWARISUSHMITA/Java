class  M17
{
	static void test(String s1, int ... x)  //(int ... x)var arg means variable number of arguments
	{
		System.out.println("test with var args" + x.length); // here x ia an array
		for (int i : x )
		{
			System.out.println(i); //print arguments
		}
	}
	public static void main(String[] args) 
	{
		test("xyz");
		System.out.println("---------");
		test("xyz",10);
		System.out.println("---------");
		test("xyz",1,20);
		System.out.println("---------");
		test("xyz",30,50,200,500);
		System.out.println("---------");
	}
}

/*
String s1 is fixed
test with var args0
---------
test with var args1
10
---------
test with var args2
1
20
---------
test with var args4
30
50
200
500
---------

argsnumber according to number
*/