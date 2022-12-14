class M32
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try body");
		}
		catch (ArithmeticException ex)
		{

		}
		System.out.println("main end");
	}
}
/*
in case of unchecked compiler least bothering about usage of try and catch

*/