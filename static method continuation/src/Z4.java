
class  Z4
{
	 static 
	{
		System.out.println("SIB1");
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
	}	
	static  
	{
		System.out.println("SIB2");
	}
	static  
	{
		System.out.println("SIB3");
	}
}
/*
SIB1
SIB2
SIB3
main
once initializer got over then main method excutes
*/