class B
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (true)
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
		System.out.println("else end");
		
		}
		System.out.println("main end");
		
	}
}
/*
main begin
if block
main end

*/
