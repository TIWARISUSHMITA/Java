class Z1
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i  = 10;
        if(i++  == 11  &&  i++ == 11) 
       //   10  == 11 &&  11 ==11 (falsee ||true)   
		{
			System.out.println("if -block-stmt1 "  + i);  //12
			System.out.println("if -block-stmt2 "  + i++);  //12
			i++;  //13
	
		}

		System.out.println("main end : "  +i);  //11
	}
}
/*
the if block isn't excuted becouse of (&&) and operator
so the final i value is 11
*/
