class  M67
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (true)
		{
			System.out.println("from if");
			throw new ArithmeticException();
		}
		System.out.println("main end");
	}
}
/*
by usinh throes keyword 
main begin
from if
Exception in thread "main" java.lang.ArithmeticException
        at M67.main(M67.java:9)

*/
