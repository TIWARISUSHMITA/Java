class M45
{
	static void test1() throws ClassNotFoundException
	{
		System.out.println("test1 begin");
		Class.forName("");
		System.out.println("test1 end");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("main end");
	}
}
/*

there no try catch compilation error at line no 12
becouse no throws no try - catchat line no 12

M45.java:12: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
                test1();
                     ^
1 error

*/
