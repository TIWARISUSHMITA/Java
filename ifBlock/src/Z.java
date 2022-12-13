class Z
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i  = 10;
        if(i++  == 11|| i++ == 11) 
       //   10  == 11 ||  11 ==11 (false ||true)   
		{
			System.out.println("if -block-stmt1 "  + i);  //12
			System.out.println("if -block-stmt2 "  + i++);  //12
			i++;  //13
	
		}

		System.out.println("main end : "  +i);  //14
	}
}
/*
the first variable  is false but the second one is true  so the programe is excute becouse of or || operator
*/