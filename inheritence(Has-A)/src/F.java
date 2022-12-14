class  A
{
	 int i ; 
}
class F
{
	A obj = new A();

	public static void main(String[] args) 
	{ 
		F f1 = new F();
		System.out.println(f1.obj.i); //this is the taking the input as a line no 7
		A a1 = new A();
		System.out.println(a1.i);
	}
}
/*
0
0
F has A 
*/