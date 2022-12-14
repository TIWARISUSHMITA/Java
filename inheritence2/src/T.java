class  A
{
	static int i;  //i = 0;
	static
	{
		System.out.println("A-SIB1"); 
	}
	
	static
	{   
		System.out.println("A-SIB2");
	}
}
	
class B extends A
{
	static int j;  //i = 0;
	static
	{
		System.out.println("B-SIB1");
	}
	static
	{
		System.out.println("B-SIB2");
	}
}

class T
{
	static
	{
	
		System.out.println("I-SIB");
	}
	static
	{
		System.out.println("I-SIB");
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		System.out.println(A.i);
		System.out.println("--------");
		System.out.println(B.j);
		System.out.println("main end");
	}

}
/* 

T is not sub class to B
T is not cheking that A is loaded oe not B is loaded or not

I-SIB
I-SIB
main begin
A-SIB1
A-SIB2
0
--------
B-SIB1
B-SIB2
0
main end


*/