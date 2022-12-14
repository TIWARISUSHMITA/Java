abstract class A 
{
	
}
class I
{
	public static void main(String[] args)
	{
		A obj = new A();//creat object
		System.out.println("done");
	}
}

/*
abstract is the incomplete class
we can not create a object class in abstract class
I.java:9: error: A is abstract; cannot be instantiated
                A obj = new A();
                        ^
1 error


*/