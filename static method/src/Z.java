class  Z
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main middle");
		char s1 = test();
		System.out.println("main end : " +s1);
	}
		public static char test()  
	{
		System.out.println("test begin");
		System.out.println("test middle");		
		System.out.println("test end"); 
		return 'Y';
	}
}
/*
main begin
main middle
test begin
test middle
test end
main end : Y

three are most importent 1. data type is same
now here line no 7,11,16 is same which is char
*/