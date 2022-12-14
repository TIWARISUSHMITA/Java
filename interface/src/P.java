interface A
{
	void test1();
}
class P implements A
{
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}
/*
if in interface be want to inheritence then should be use implements(replacing extends)
P.java:5: error: P is not abstract and does not override abstract method test1() in A
class P implements A
^
1 error

*/