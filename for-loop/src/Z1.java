class Z1
{
	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		int i=100 ;
		for ( System.out.println("INIT"),i = 1 ; i<=5 ;i++ )   
                  

		{
			System.out.println("loop body:" + i); 
			
		}
		System.out.println("main end" +i);
	}
}
/*
main begin
INIT  //it is in the initialize portion so it get only one time
loop body:1
loop body:2
loop body:3
loop body:4
loop body:5
main end6


*/