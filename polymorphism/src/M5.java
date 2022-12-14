abstract class A
{
	abstract void test();
}

class  B extends A
{
	void test()
	{
		System.out.println("from B.test");
	}

}
class  C extends B
{
	void test()
	{
		System.out.println("from C.test");
	}

}
class M5
{
	public static void main(String[] args) 
	{
		B b1 = new B(); 
		C c1 = new C();
		A[] elements = { b1, c1};	
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


from B.test
from C.test
here class A is abstract type  that is why we can creat an object of abstract class

*/