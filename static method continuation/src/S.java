class  S
{
	static int i = 100;
	public static void test()
	{
	System.out.println("test : " +i);
	i = 20;
	}
	public static void main(String[] args) 
	{
		System.out.println("main : " +i);
		i = 10;
		test();
		System.out.println("main : " +i);
	}
}
/*

main  :  100
test : 10 
main : 20
 here i value is alweys modified



*/