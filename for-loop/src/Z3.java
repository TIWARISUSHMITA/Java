class Z3
{
	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		int i=100 ;
		for ( System.out.println("INIT"),i = 1 ; i<=5 ,System.out.println("BOOLEAN COND") ;i++ ,System.out.println("CHANGE"))   
                  

		{
			System.out.println("loop body:" + i); 
			
		}
		System.out.println("main end" +i);
	}
}
/*
compile time error
(,)comma is not allow in the boolean condition  we can use either  && symbol  or ||  symbol

*/