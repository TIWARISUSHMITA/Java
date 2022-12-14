class M49
{
	public static void main(String[] args) 
	{
		try
		{
			int i =10;
			i = 20;
			i++ ;
		}
		catch (ClassNotFoundException ex)
		{

		}
		
			
	}
}
/*
compiler not allowing try without keeping a classNotFoundException

M49.java:11: error: exception ClassNotFoundException is never thrown in body of corresponding try statement
                catch (ClassNotFoundException ex)
                ^
1 error

*/
