class  R
{
	int i ;
	static void test()
	{
		R ref = new R();
		System.out.println(ref.i);
		ref.i = 200;
		System.out.println(ref.i);

	}
	public static void main(String[] args) 
	{
		System.out.println("main begin ");
		test();
		System.out.println("main end ");
		  
	}
}
/*
object can be creat in any method
not only the main method

main begin
0
200
main end
*/
