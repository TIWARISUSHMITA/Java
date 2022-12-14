abstract class A
{
	A ()
	{
		System.out.println("A()");
	}
	abstract void test1();
}
class B extends A
{
	void test1()
	{
		System.out.println("test1");
	}
}
class P
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test1();
		System.out.println("done");
	}
}
/*
A()
test1
done

inheritence doesn't inherite the constructor but in class B  the compiler make automatically constructor
it class B is the loading process whereasclass A loaded
abswtract class should have minimum one constructor
when constructor will excute ??
when the ibject is creating in an current class or sub class then it will excute


*/