class A
{
	void test()
	{
	
		System.out.println("from A.test");
		
	}
}
class  B extends A
{
	void test(int i)
	{
		System.out.println("from B.test(int)");
	}
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test();
		b1.test(10);
		System.out.println("done");
	}
}
/*
inherited method getting overloaded
not overrided
becouse of different in signature
overloading can be happen in sub class and super class

*/
