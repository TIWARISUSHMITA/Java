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
class M1
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new B(); //upcasting becouse class A is calling B()
		A[] elements = {a1 , a2};	//to print a1,a2 through the line no 21,22
		for (A element : elements) //A element : a1 in first time assigning
									// A element : a2 in second time
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

*/