class A 
{
	int i;
}
class B extends A
{
	int j ;
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i + "," +b1.j);
	}
}
/*
both are non public classes so be can save any of the file
to achive the inheritence in a two ways
extends
implements
A is super class or parent class
and B is child class or sub class
extend have a solid line whereas impllements have a doted line
B got  develod by using A
super class is genral whereas sub class is special

*/