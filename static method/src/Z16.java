class Z16
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int  i = 10;
		int j = test(++i);
		System.out.println("main end:" +i+","+j);
		System.out.println("main end :" +i+ "," +j);
	}	
	public static int test(int i) 
	{
		System.out.println("test:" +i);
		return ++i;
	}
}
/*

main begin
test:11
main end:11,12
main end :11,12
*/