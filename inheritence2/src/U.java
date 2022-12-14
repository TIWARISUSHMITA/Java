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
	
class B extends A
{
	static int j; 
	static
	{
		System.out.println("B-SIB1");
	}
	static
	{
		System.out.println("B-SIB2");
	}
}

class U
{
	static
	{
	
		System.out.println("U-SIB");
	}
	static
	{
		System.out.println("U-SIB");
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		System.out.println("---------");
		System.out.println(B.j);
		System.out.println("--------");
		System.out.println(A.i);
		System.out.println("main end");
	}

}
/* 
 U is not depends on Class B becouse it isn't inheritinhg the above classes
 but b is sub class of A 
 when B is starting the loading but but A	 is not loaded so b sikps the loadind while A is not completed to loading then B has loaded
U-SIB
U-SIB
main begin
---------
A-SIB1
A-SIB2
B-SIB1
B-SIB2
0
--------
0
main end


*/