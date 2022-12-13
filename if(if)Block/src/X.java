class X
{
	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		if (true)
			System.out.println("if 1");
	    if (false)
             int i =10;
        if (true)
        System.out.println("if 3");
     	System.out.println("main end");
	   
	}
}
/*

java:10: error: variable declaration not allowed here
             int i =10;
                 ^
1 error

*/