class  Z1
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main middle");
		byte s1 = test();
		System.out.println("main end : " +s1);
	}
		public static byte test()  
	{
		System.out.println("test begin");
		System.out.println("test middle");		
		System.out.println("test end"); 
		return 100;
	}
}
/*
main begin
main middle
test begin
test middle
test end
main end :100

three are most importent 1. data type is same
now here line no 7,11,16 is same which is byte
derived means we are developing

*/