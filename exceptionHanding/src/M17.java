class M17
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		try
		{
			System.out.println("try begin");
			i = 20 ;
			System.out.println("try end");
		}
		catch (NullPointerException ex)
		{
			System.out.println("from catch : ");
			i = 30;
		}
		System.out.println("main end" + i);
	}
}
/*
main begin
try begin
try end
main end20

*/