class  S
{
	int i ;
	public static S test()
	{
		S ref = new S();
		System.out.println(ref.i);
		ref.i = 200;
		System.out.println(ref.i);
		return ref ;

	}
	public static void main(String[] args) 
	{
		System.out.println("main begin ");
		S obj = test();
		System.out.println("main end : " + obj.i);
		  
	}
}
/*
main begin
0
200
main end : 200

*/
