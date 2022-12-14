class  M
{
	private void test()
	{
	}
}
class N extends M
{
	public static void main(String[] args) 
	{
		M m1 = new M();
		n1.test();
		System.out.println("Hello World!");
	}
}
/*
priveate member should inheriting in the sub class 
N.java:12: error: test() has private access in M
                m1.test();
                  ^
1 error
usges :- where be can use where be can access
inheritence:- no inheritence in private members

usges should be in the current class
the prive member is not involve in the inheritence

*/
