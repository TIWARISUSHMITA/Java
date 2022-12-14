class  A
{
	static int i;
	static
	{
		System.out.println("A-SIB1"); 
	}
	
	static
	{   
		System.out.println("A-SIB2");
	}
}
	
class R extends A
{
	static
	{
		System.out.println("R-SIB1");
	}
	static
	{
		System.out.println("R-SIB2");
	}

	public static void main(String[] args)
	{
		System.out.println("main begin");
		System.out.println(A.i);
		System.out.println("main end");
	}

}
/* 
A-SIB1
A-SIB2
R-SIB1
R-SIB2
main begin
0
main end
 A class SIB is not inheriting to R
 once A got loaded in the the memory then R is  loaded becouse R sub class i

*/