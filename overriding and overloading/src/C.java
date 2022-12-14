class A
{
	void test()
	{
	
		System.out.println("from A.test");
		
	}
}
class  C extends A
{
	void test()
	{
		System.out.println("from C.test()");
	}
	public static void main(String[] args) 
	{
		C obj = new C();
		obj.test();
		System.out.println("done");
	}
}
/*
if sub class method's signature same as the super class method then the super class method is attempting to overrid
same method and same sighnature in sub class and super class is known as overriding


*/
