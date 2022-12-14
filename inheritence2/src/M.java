class  A
{
	A()
	{
		System.out.println("A()"); //first stmt is super calling stmt
	}
	
	A(int i)
	{
		this();  //it indicate the super calling stmt of the IIB 
		System.out.println("A(int)");
	}
	{
		System.out.println("A-IIB");
	}
}
class M
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("------------");
		A a2 = new A(20);
		System.out.println("------------");
	}
}
/*
there is no inheritence here
M is not a sub class to A
IIB content will be only in the first constructor in the body
in second constructor becouse of this

if first  stmt is this callingstmt so the compiler will not excute the IIB in second time

A-IIB
A()
------------
A-IIB
A()
A(int)
------------

*/