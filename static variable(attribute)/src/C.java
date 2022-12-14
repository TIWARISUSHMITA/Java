class C
{
	static 
	{
		System.out.println(C.i);  //indirect read 
		i = 10 ; //direct write 
		C.i =10; //indirect write
		test();
	}
	static int i;
	public static void test()
	{
		System.out.println(i);  //indirect read
		i =  20; //indirect write
	}
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
/*
indirct  read is allowing in JVM
in side the SIB it compiles sucess becouse direct read is not there
0
10
20
no gllobal variable can read directly before notifying

*/