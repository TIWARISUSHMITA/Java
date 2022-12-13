class Z12
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main end");
	}	
	public static void test(int i) 
	{
		double i =5.4;
		System.out.println("test:" +i+","+i);
	}
}
/**

Z12.java:10: error: variable i is already defined in method test(int)
                double i =5.4;
                       ^
1 error   
  data type is change(int double)
  both are having same data type
  no matterin main method the test method decleared or not because in test method the error is 
  occuring then definetly it will occuring error

*/