class A 
{
	A()
	{
		System.out.println("A()");
	
	}
	A(int i)
	{
		System.out.println("A(int)");
	}
}
class B extends A
{
	B()
	{
		//super();
		System.out.println("B()");
	}
	B(int i)
	{
		//super();
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
if  we are both keeping the super () then compiler will incorporate super() with no argument
main begin
A()
B()
----------
A()
B(int)
----------
main end
 in this program  no one class showing the super() but the output is getting accoring to super ker becouse if the class having no super() then the  compiler cooperate their own super() without argument
 and then the output is getting according to super(0
 here i put the super() in comment for understanding my self
 in line no 22 and 17 keeping the super() to the understanding purpose not in the originality in the progrm 

*/

