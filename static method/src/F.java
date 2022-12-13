class  F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(); 
		System.out.println("---------");	
		test(); 	
		System.out.println("----------");
		test(); 
		System.out.println("main end");
	}
	public static void test() 
	{
		System.out.println("test begin");
		System.out.println("test end");
	}

}
/**
main begin
test  begin
test end
-------
test begin 
test end
-------
test begin
test end
main end
methods can have any type any number of stmt





*/
