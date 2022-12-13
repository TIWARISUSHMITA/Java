class K1
{
	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		for (int i =3; i <=10 ; i ++ )  
      

		{
			System.out.println("loop begin:" +i);
			if (i == 1)  
			{
				System.out.println("if block");
				break; 
			
			}
			System.out.println("loop end:" +i);
			System.out.println("============");
		}
		System.out.println("main end");
	}
}
