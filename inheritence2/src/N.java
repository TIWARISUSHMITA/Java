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
	
	A(int i , int j)
	{
		this(i); 
		System.out.println("A(int , int)");
	}
	{
		System.out.println("A-IIB");
	}
}
class N
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("------------");
		A a2 = new A(20);
		System.out.println("------------");	
		A a3 = new A(20,30);
		System.out.println("------------");
	}
}
/*
three constructor and one IIB
first constructor have IIB not to any other

A-IIB
A()
------------
A-IIB
A()
A(int)
------------
A-IIB
A()
A(int)
A(int , int)
------------

*/