abstract class A
{
	abstract void test1();
}
class B extends A
{
	void test1()
	{
		System.out.println("test1");
	}
}
class O
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test1();
		System.out.println("done");
	}
}
/*
test1
done

Inside a B no abstract method so it doesn't require decleare as an abstract 
so it is runnable

*/