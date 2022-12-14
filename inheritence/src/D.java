class C 
{
	void test1()
	{
		System.out.println("C-test1");
	}
}
class D extends C
{
	void test2()
	{
		System.out.println("D-test2");
	}
	public static void main(String[] args) 
	{
		D d1 = new D();  //create an object
		d1.test1(); //method calling
		System.out.println("--------");
		d1.test2(); //method calling
	}
}
/*
inside  a D class two non static member
C is super class 
D is sub class

C-test1
--------
D-test2
*/