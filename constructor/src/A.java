class A 
{
	A()
	{
		System.out.println("A()");
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("---------");
		A a2 = new A();
	}
}
/*
consturcter should hava a same name as class name
constructer should not have a return typr
itis almost same as a method but most of the differnce that method should have return typt but 
constructer should not have return type
construcer has to excute automatically in the memory
A()
---------
A()
*/