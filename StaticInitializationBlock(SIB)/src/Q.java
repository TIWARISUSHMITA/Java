class  Q
{
	int i ;
	static void test(Q arg)
	{
		System.out.println("from test : " + arg);
		System.out.println("from test : " + arg.i);
		arg.i += 100;

	}
	public static void main(String[] args) 
	{
		Q ref = new Q();
		ref.i = 100;
		System.out.println("from main : " + ref);
		System.out.println("from main 1 : " + ref.i);
		test(ref);
		System.out.println("from main 2 : " + ref.i);
		ref.i += 100;
		Q.test(ref);
		System.out.println("from main 3 : " + ref.i);
		ref .i += 100 ;
		ref.test(ref);	// Q.test(ref)
		System.out.println("from main 4 : " + ref.i);
		  
	}
}
/*
from main : Q@15db9742
from main 1 : 100
from test : Q@15db9742
from test : 100
from main 2 : 200
from test : Q@15db9742
from test : 300
from main 3 : 400
from test : Q@15db9742
from test : 500
from main 4 : 600

*/
