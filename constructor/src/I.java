class I
{
	I(int x) 
	{
		System.out.println("I(int)");
	
	}
	public static void main(String[] args) 
	{
		I obj1 = new I(); 
		System.out.println("----------");
		I obj2 = new I(); 
		System.out.println("--------");

				
	}
}
/*
local x value assigning into global x
compilation error
argument constructor avilable into i 
in main meethod object created without argument whereas is avilable  constructer with argument  
*/