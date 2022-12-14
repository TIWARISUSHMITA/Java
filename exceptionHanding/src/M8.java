class M8
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
			System.out.println("from catch : " + ex); //ex is the object and it prints the exception of object
		}
		System.out.println("main end");
	}
}
/*
main begin
try begin
from catch : java.lang.ArithmeticException: / by zero
main end

in line no 14 we are printing ex value which is exception  means it is printing the exception object
*/