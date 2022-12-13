class  W
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main middle");
		int s1 = test();
		
		System.out.println("main end : " +s1);
	}
		public static int test()  
	{
		System.out.println("test begin");
		System.out.println("test middle");		
		System.out.println("test end"); 
		return 100;
	}
}
/**

main begin
main middle
test begin
test middle
test end
main end : 100

return type and return value and return varible should be same 
any data type avilable in programming language

primitive data types are avilable 
----------------------------------
1. byte
2. short
3. long
4. int
5. float
6. double
7. boolean
8. char
*/