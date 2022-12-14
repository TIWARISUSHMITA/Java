class  M34
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			Class.forName("");
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println("try catch");
		}
		System.out.println("main end");
	}
}
/*
main begin
try catch
main end
*/
