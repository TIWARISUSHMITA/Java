class J
{
	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		for (int i =1; i <=10 ; i ++ )  
      

		{
			System.out.println("loop begin:" +i);
			if (i <= 6)  
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
/*
whenever brak is excute
break means exist for (loop)

main begin
loop begin:1
if block
main end
*/