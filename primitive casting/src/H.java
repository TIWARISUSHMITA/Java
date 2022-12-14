class H
{
	static float test1(short s)
	{
		System.out.println("from test1");
		return test2(s);
	}
	static long test2(int s)
	{
		System.out.println("from test2");
		return s ; //return (float) s;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		byte b1 = 10;
		double d2 = test1(b1);
		System.out.println("main end");
	}
}
/*

main begin
from test1
from test1
main end

*/