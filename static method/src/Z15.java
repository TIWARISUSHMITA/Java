class Z15
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int  i = 10;
		int j = test(i++);

		System.out.println("main end :" +i+ "," +j);
	}	
	public static int test(int i) 
	{
		System.out.println("test:" +i);
		return ++i;
	}
}
/*
main method becoming 11 but 10 only sending to test method

main method i can not getting change

main begin
test:10
main end :11,11

*/