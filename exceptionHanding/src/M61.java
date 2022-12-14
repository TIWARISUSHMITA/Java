class A
{
	void test1() throws Exception
	{
	
	}
}
class M61 extends A 
{
	void test1() throws ClassNotFoundException
	{
	
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
Hello World!

all sub class checked as a excptin only
*/