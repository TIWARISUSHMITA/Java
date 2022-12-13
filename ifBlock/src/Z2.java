class Z2
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i  = 10;
        if(i++  == 10  &&  i++ == 11) 
       //   10  == 10  &&  11 ==11 (true||true)   
		{
			System.out.println("if -block-stmt1 "  + i);  //12
			System.out.println("if -block-stmt2 "  + i++);  //12
			i++;  //13
	
		}

		System.out.println("main end : "  +i);  //14
	}
}

