class A 
{
	A()
	{
		System.out.println("A()");
	
	}
	A(int i)
	{
		Systemout.println("A(int)");
	}
}
class B extends A
{
	B()
	{
		System.out.println("B()");
	}
	B(int i)
	{
		System.out.println("B(int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		B b1 = new B();
		System.out.println("----------");
		B b2 = new B(20);
		System.out.println("----------");
		System.out.println("main end");
	}
}
/*
main begin
A()
B()
------
A(int)
B(int)
------
main end
*/