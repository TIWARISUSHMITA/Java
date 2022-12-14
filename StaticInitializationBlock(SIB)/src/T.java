class T 
{
	int i ; 
	public static void test1(T t1)
	{
		System.out.println("test1 : " + t1.i);
		t1.i += 200;
	}
	public static T test2()
	{
		T ref = new T();
		System.out.println("test2 begin : " + ref.i);
		ref.i = 200;
		test1(ref);
		System.out.println("test2 end : " + ref.i);
		ref.i += 300;
		return ref;
	
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		T obj = test2();
		System.out.println("main end : " + obj.i);
	}
}
/*
method test2 teking derived data type
once creation got over then we will calling
main begin
test2 begin : 0
test1 : 200
test2 end : 400
main end : 700
*/
