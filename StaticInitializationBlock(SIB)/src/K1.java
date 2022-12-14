class K1
{
	public void test()
	{
		System.out.println(this); //non static
	}
	public static void main(String[] args) 
	{
		System.out.println(this); //static 
	}
}
/*
this is not avilable in any static mebers
it avilable in every non static member
in side a test method this is avilable
but in main method it is not present
compilation error
*/
