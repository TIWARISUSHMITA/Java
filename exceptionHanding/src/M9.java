class M9
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			int i = 10 / 0;
			System.out.println("try end");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("from catch : " + ex.getMessage());
		}
		System.out.println("main end");
	}
}
/*

main begin
try begin
from catch : / by zero
main end


here it prints /by Zero means the point which is occuring the exception 
*/