class  M1
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10/0;
		System.out.println("main end");
	}
}
/*
main begin
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at M1.main(M1.java:6)
		in java if any ubnormal condition is occuring then exception is handle

		the line no 6 is arithmatic type that is why the exception is occuring in ArithmaticException
*/