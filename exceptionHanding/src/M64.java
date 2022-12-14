class M64 
{
	public static void main(String[] args) 
	{
		try
		{
			//some stmt
		}
		catch (NullPointerException ex)
		{
			System.out.println(ex);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex);
		}
		catch(NumberFormatException ex)
		{
		System.out.println(ex);
		}
	}
}
