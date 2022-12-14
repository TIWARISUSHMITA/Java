
class  B 
{
	public static void test()
	{
		System.out.println("from B.test");
	}

}
class  C extends B
{
	public static  void test()
	{
		System.out.println("from C.test");
	}

}
class M8
{
	public static void main(String[] args) 
	{
		B b1 = new B(); 
		C c1 = new C();
		B[] elements = { b1, c1};		
		for (B element : elements) 
								
		{
			element.test(); //B.test();
		}
	}
}
/*
from B.test
from B.test


static members are only change static member
compiler always chaking what is the reference type of variable
here element is B type
we can not achive polymorphism through static members
through static we can not polymorphism or any object oriented programming
we can not override the static method
once we can develop the static method then we can modify this
static members are class mebers
test method of B it will always acting as a b 
static members can not overrided in the sub class that is why it prints from B.test in two times
it is acting as a super class that is why static member can not be override 


*/