class  A
{
	static int i; //i = 0;
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
	static int j; //j = 0;
	static
	{
		System.out.println("B-SIB1");
	}
	static
	{
		System.out.println("B-SIB2");
	}
}
class S extends B
{
	static 
	{
		System.out.println("S-SIB1");
	}
	static
	{
		System.out.println("S-SIB2");
	}

	public static void main(String[] args)
	{
		System.out.println("main begin");
		System.out.println(A.i);
		System.out.println("--------");
		System.out.println(B.j);
		System.out.println("--------");
	}

}
/* 
A-SIB1
A-SIB2
B-SIB1
B-SIB2
S-SIB
S-SIB
main begin
0
--------
0
--------
B is sub class to A 
s is sub class B
 while running to S 

 A class SIB is not inheriting to R
 once A got loaded in the the memory then R is  loaded becouse R sub class is dependig on the parent class
multilevel inheritence

*/