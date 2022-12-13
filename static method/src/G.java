class  G
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1(); 
		System.out.println("---------");	
		test2(); 	
		System.out.println("----------");
		test1(); 
		System.out.println("main end");
	}
	public static void test1() 
	{
		System.out.println("test1 begin");
		test2();
		System.out.println("test1 end");
	}
		public static void test2() 
	{
		System.out.println("from test2");
	}

}
/**
main begin
test1 begin
from test2
test1 end
-----------
from test2
----------
test1begin
from test2
test1 end
main end

a method can be call any method 
it keep calling any way

methods can have any type any number of stmt





*/
