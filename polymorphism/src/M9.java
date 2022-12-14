class A
{
	static 
	{
		System.out.println("from A.SIB");
	}
	static void test()
	{
		System.out.println("from A.test");
	}
}

class  B extends A
{
	static 
	{
		System.out.println("from B.SIB");
	}
}
class M9
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		B.test(); //compiler replacing from B.test to A.test
		System.out.println("main end");
	}
}
/*
main begin
from A.SIB
from A.test
main end

B is not loades in the memory

*/