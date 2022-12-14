class A
{
	void test()
	{
		System.out.println("from A.test");
	}
}

class  B extends A
{
	void test()
	{
		System.out.println("from B.test");
	}

}
class  C extends A
{
	void test()
	{
		System.out.println("from C.test");
	}

}
class M3
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		B b1 = new B(); 
		C c1 = new C();
		A[] elements = {a1 , b1, c1};	
		for (A element : elements) 
								
		{
			element.test();
		}
	}
}
/*
inside B class test methode got overrided 
the original object is B  becouse of method overriding
to achive polymorphism we have to follow two conditions
-------
1: method overriding
2: upcasting
without  upcasting and method overriding we can not implement the polymorphism

from A.test
from B.test
from C.test

*/