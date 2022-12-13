class Z13
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int  i=10;  //i is locate to main method so value only going to main method
		test(i); //pass by value
		System.out.println("main end :" +i);
	}	
	public static void test(int i) 
	{
		double i =5.4;
		System.out.println("test:" +i);
		i = 20;
	}
}
/**
 
error
in main method i can not getting change
this i is locate to main method test(i) -pass by value
(value only going to method)
main method i can not getting change


*/