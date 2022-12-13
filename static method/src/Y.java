class  Y
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main middle");
		double s1 = test();
		System.out.println("main end : " +s1);
	}
		public static double test()  
	{
		System.out.println("test begin");
		System.out.println("test middle");		
		System.out.println("test end"); 
		return 5.5;
	}
}
/*
main begin
main middle
test begin
test middle
test end
main end : 5.5

three are most importent 1. data type is same
now here line no 7,11,16 is same which is double
*/