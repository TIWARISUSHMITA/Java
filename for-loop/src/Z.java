class Z
{
	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		int i=100,j=400;
		for ( i = 1,j = 10 ; i<=5 && j>= -5 ;i++ , j -=2 )   
                  

		{
			System.out.println("loop body:" + i+ "," +j); 
			
		}
		System.out.println("main end" +i+","+j);
	}
}
