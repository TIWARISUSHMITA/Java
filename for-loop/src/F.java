class F
{
	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		for (int i =1; i <=10 ; i++ )  
      

		{
			System.out.println("loop begin:" +i);
			if (i == 6)  //here 6 means 6 me contiunue
			{
				continue;
			}
			System.out.println("loop end:" +i);
			System.out.println("============");
		}
		System.out.println("main end");
	}
}
/*
in this when the condition is going to 6 then it only print loop begin :6

continue skip the remainig portion  and going to thre next portion
*/