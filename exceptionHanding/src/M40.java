class M40
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
	public static void test()
	{
		System.out.println("test begin");
		int i = 10/0;
		System.out.println("test end");
	}
}
/*
main begin
test begin
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at M40.test(M40.java:12)
        at M40.main(M40.java:6)

*/