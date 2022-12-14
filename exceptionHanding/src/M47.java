class M47
{
	static void test1() throws ClassNotFoundException
	{
		System.out.println("test1 begin");
		Class.forName("");
		System.out.println("test1 end");
	}
	public static void main(String[] args) throws ClassNotFoundException 
	{
		System.out.println("main begin");
		test1();
		System.out.println("main end");
	}
}
/*
main begin
test1 begin
Exception in thread "main" java.lang.ClassNotFoundException:
        at java.lang.Class.forName0(Native Method)
        at java.lang.Class.forName(Unknown Source)
        at M47.test1(M47.java:6)
        at M47.main(M47.java:12)


compilation is succes by using throw
in 
*/
