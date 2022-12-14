class  M16
{
	static void test(int ... x)  //(int ... x)var arg means variable number of arguments
	{
		System.out.println("test with var args" + x.length); // here x ia an array
		for (int i : x )
		{
			System.out.println(i); //print arguments
		}
	}
	public static void main(String[] args) 
	{
		test();
		System.out.println("---------");
		test(10);
		System.out.println("---------");
		test(1,20);
		System.out.println("---------");
		test(30,50,200,500);
		System.out.println("---------");
	}
}

/*
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