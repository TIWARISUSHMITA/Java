abstract class A
{
	abstract void test1();
}
abstract class B extends A
{
}
class M
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("done");
	}
}
/*
M.java:12: error: B is abstract; cannot be instantiated
                B b1 = new B();
                       ^
1 error
 in class M  it is crating the obj which is not allow in the abstract or abstraction
A and B both are syntacticlly correct but in class M it is creating object
*/