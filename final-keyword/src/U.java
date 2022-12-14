class U
{
	final int i ;
	U()
	{
		i= 0; 
	}
	U(int i)
	{
		this();  
	}

	{
		i = 0;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
U.java:6: error: variable i might already have been assigned
                i= 0;
                ^
1 error

*/