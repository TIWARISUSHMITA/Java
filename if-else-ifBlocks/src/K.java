class K
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (false)
		{
			System.out.println("if block");
		}
		else
		{
		System.out.println("else begin");
		if (true)
		{
			System.out.println("else if block");
		}
		else
			{
				System.out.println("else else block");
				if (true)
				{
					System.out.println("else else if block");
				}
				else
				{
				System.out.println("else else else block");
				}
				System.out.println("else else block end");
			}
		System.out.println("else end");
		
		}
		System.out.println("main end");
		
	}
}
/*
main begin
else begin
else if block 
else end
main end

*/
