class M
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
		if (false)
		{
			System.out.println("else if block");
		}
		else
			{
				System.out.println("else else block begin");
				if (false)
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
else else block begin
else else else block
else else block end
else end
main end

*/
