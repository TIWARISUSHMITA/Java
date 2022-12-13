class P
{
	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		int i=5 ;  //initial value  i is 5 but
		for (i =15; i <=10 ; i++ )   //i value is modified and now the value is 15
                  //false

		{
			System.out.println("loop body:" +i); 
		}
		System.out.println("main end" +i); //15
	}
}
