class O 
{
	int i ;
	static void test()
	{
		System.out.println("from test");
	}
	public static void main(String[] args) 
	{
		O ref = new O();
		System.out.println(ref.i);
		test();
		O.test();
		ref.test(); //O.test()
	}
}
/*
0
from test
from test
from test

*/