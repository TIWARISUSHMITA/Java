class One 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println(10/0);


	}
}
/*
Hello World!
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at One.main(One.java:6)
*/