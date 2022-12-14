class  M68
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (true)
		{
			System.out.println("from if");
			throw new ArithmeticException("some message");
		}
		System.out.println("main end");
	}
}
/*
main begin
from if
Exception in thread "main" java.lang.ArithmeticException: some message
        at M68.main(M68.java:9)

*/
