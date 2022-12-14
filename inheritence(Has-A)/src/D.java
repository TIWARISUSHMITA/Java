class  A
{
	 int i ; 
}
class D
{
	A obj; //non static or global

	public static void main(String[] args) 
	{ 
		//System.out.println(obj); 
		D d1 = new D();
		System.out.println(d1.obj);
		A a1 = new A();
		System.out.println(a1.i);
	}
}
/*
null
0
obj is the non static member of the D class
D has A 


*/