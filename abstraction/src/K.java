abstract class A
{
	abstract void test1();
}  
class B extends A
{
}
class K
{
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
/*

K.java:5: error: B is not abstract and does not override abstract method test1() in A
class B extends A
^
1 error

B should be declaering in abstract

*/