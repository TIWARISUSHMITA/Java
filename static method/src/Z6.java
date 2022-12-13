class Z6
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(100); //test calling 
		System.out.println("main end");
	}	
	public static void test(int i) 
	{
		System.out.println("test: " +i);
	}
}
/**
return type is not present but under the test calling it gives the value of i =100

main begin
test: 100
main end


*/