//inheritence starts in this file name
class  A
{
	static
	{
		System.out.println("A-SIB1"); 
	}
	
	static
	{   
		System.out.println("A-SIB2");
	}
}
	
class P
{
	static
	{
		System.out.println("P-SIB");
	}
	static
	{
		System.out.println("P-SIB");
	}

	public static void main(String[] args)
	{
		System.out.println("main!");
	}

}
/* invovment of SIB
whenever P is is excuting in the memory 
P is not a sub class it independent class
in inheritence SIB ,IIB, constructor are not inheriting....

P-SIB
P-SIB
main!

*/