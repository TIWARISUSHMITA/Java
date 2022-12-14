class M14
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
		catch (NullPointerException ex)
		{
			System.out.println("from catch : ");
			ex.printStackTrace();
		}
		System.out.println("main end");
	}
}
/*
try begin
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at M14.main(M14.java:9)

proper type casting is also here
the main exception is arithmetic type which is in line no 9 but in the catch there is nullPointerException 
which is unsuitable
*/