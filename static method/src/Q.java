class  Q
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main middle");
		test();
		
		System.out.println("main end");
	}
		public static int test()   //this is comes under primitive which is satisfying the 2 condition of the the privious given condition
	{
		System.out.println("test begin");
		System.out.println("test middle");		
		System.out.println("test end"); 
		return ;
	}
}
/**

missing return stmt because the test method is int means test method have mandutriy the return stmt with a specific value
compilatio error
becouse return stmt is not have a value


*/