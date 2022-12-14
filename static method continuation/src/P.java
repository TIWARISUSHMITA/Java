class  P
{
	static int i ;
	public static void test()
	{
		System.out.println("test : " +i);
	}
	public static void main(String[] args) 
	{
		System.out.println("main : " +i);
	}
}
/*
main : 0

p class containg three mamebers
i print only one which is only local or global
here in main method test mathofd is not calling
*/