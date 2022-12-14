class I1 
{
	 static void test1()
	{
		System.out.println("test1");
	}
    static void test2()
	{
		System.out.println("test2");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		I ref =  new I();
		ref.test1();
		System.out.println("---------");
		ref.test2();
		System.out.println("main end");
	}
}

/*
test1 and test2 both are non static 
whenever 
while accessing a non static variable we should have a reference varible

main begin
test1
---------
test2
main end

*/