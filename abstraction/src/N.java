abstract class A
{
	abstract void test1();
}
abstract class B extends A
{
	void test1()
	{
		System.out.println("test1");
	}
}
class N
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test1();
		System.out.println("done");
	}
}
/*
N.java:16: error: B is abstract; cannot be instantiated
                B b1 = new B();
                       ^
1 error
class B is abstract but the method which is under the the class B is not abstract 
so class B can should be without abstract 

*/