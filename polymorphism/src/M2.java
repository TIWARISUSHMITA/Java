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
class M2
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		B b1 = new B(); //no upcasting becouse class B is creating new Object
		A[] elements = {a1 , b1};	//to print a1,b2 through the line no 21,22
		for (A element : elements) //A element : a1 in first time assigning
									// A element : b2 in second time
		{
			element.test();
		}
	}
}
/*
without overriding and upcasting we can achive polymorphism
inside B class test methode got overrided 
the original object is B  becouse of method overriding
to achive polymorphism we have to follow two conditions
-------
1: method overriding
2: upcasting

from A.test
from B.test
without  upcasting and method overriding we can not implement the polymorphism

*/