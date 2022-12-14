class  A
{
	public static void test()
	{
		System.out.println("A.test");
	}
}
class N
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A.test();
		System.out.println("main end");
	}
}
/*

test method is not define in A class

main begin
A.test
main end


*/