class A
{
	void test1() throws ClassNotFoundException
	{
	
	}
}
class M60 extends A 
{
	void test1() 
	{
	
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*

Hello World!
any method can override without a throws 
rule :

1. any method can override ny choose throws
compiler not bothering about unchecked
we can found uncked for any method


2.any method can be overridde without throws
(throws is not mandtury)

3. we can not override a method if throws checked
then super class method is also sholud a throws checked
*/