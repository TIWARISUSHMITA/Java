class M10
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
			System.out.println("from catch : ");
			ex.printStackTrace();
		}
		System.out.println("main end");
	}
}
/*
main begin
try begin
from catch :
java.lang.ArithmeticException: / by zero
        at M10.main(M10.java:9)
main end


printStack means it prints all the topic with line no where the exception is occuring
or in otherwords we can say more information about exception is using printStackTrace 
we can not use try alone otherwise getting error
*/