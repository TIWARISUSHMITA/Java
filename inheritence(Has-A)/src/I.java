class  A
{
	 int x ; 
}
class I
{
	A obj ;
	I(A obj)
	{
		this.obj = obj;
	}
	public static void main(String[] args) 
	{ 
		A a1 = new A();
		I ref = new I(a1);
		System.out.println(a1.x);
		System.out.println(ref.obj.x);
		a1.x = 100;
		System.out.println(a1.x);
		System.out.println(ref.obj.x);
		ref.obj.x = 200;
		System.out.println(a1.x);
		System.out.println(ref.obj.x);
	}
}
/*
0
0
100
100
200
200
we can not create an i 
ref.obj pointing to the same in 
 
*/