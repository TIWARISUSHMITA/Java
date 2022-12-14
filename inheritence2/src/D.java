class  C
{
	C(int i)
	{
		//constructor with no argument like super() or this()
		System.out.println("C(int)");
	}
}
class D extends C
{
	D(int i)
	{
		System.out.println("D(int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin!");
		System.out.println("main begin!");
	}
}
/*
compilation error
C classn  constructer abvilable with no argument 
in class C should be super () or this ()
for runnable the programme
here the constructors are having the argument but without super() keyword so compiler cooperating their own super()
so through the compiler super() is avilable but without argument but here constructor having argument so compilation error



*/
