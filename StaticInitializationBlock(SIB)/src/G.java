class G 
{
	void test()
	{
		System.out.println("from test");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		G g1 = new G();
		g1.test();
		System.out.println("main end");
	}
}
/*
in line no 10
creating  a object
in line no 10
g1 is reference variable
*/