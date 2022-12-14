class  M15
{
	static void test(int ... x)  //(int ... x)var arg means variable number of arguments
	{
		System.out.println("test with var args" + x.length); // here x ia an array
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
---------
test with var args2
---------
test with var args4
---------


argsnumber according to number
*/