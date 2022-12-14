class A
{
	void test1()
	{
	
	}
}
class M58 extends A 
{
	void test1() throws ClassNotFoundException
	{
	
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
M58.java:10: error: test1() in M58 cannot override test1() in A
        void test1() throws ClassNotFoundException
             ^
  overridden method does not throw ClassNotFoundException
1 error

*/