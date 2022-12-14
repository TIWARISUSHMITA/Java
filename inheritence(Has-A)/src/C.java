class  A
{
	 int i ; //instance variable
}
class C
{
	public static void main(String[] args) 
	{ 
		//System.out.println(i); //it giving compile time error
		C c1 = new C();
		//	System.out.println(c1.i);
		A a1 = new A();
		System.out.println(a1.i);
	}
}
/*
0


if line no 12 is also commeneted then the run time exception becouse 
it is object of class A

*/