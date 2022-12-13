class  X
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main middle");
		boolean s1 = test();
		
		System.out.println("main end : " +s1);
	}
		public static boolean test()  
	{
		System.out.println("test begin");
		System.out.println("test middle");		
		System.out.println("test end"); 
		return true;
	}
}
/*
main begin
main middle
test begin
test middle
test end
main end : true

three are most importent 1. data type is same
now here line no 7,11,16 is same which is boolean
*/