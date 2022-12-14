class  A
{
	A()
	{
		System.out.println("A()");
	}
}
class K extends A
{
	K()
	{
		System.out.println("K()");
		this(10); //it should be above of this line
	}
	K(int i)
	{
	
	System.out.println("K()");
	}
	public static void main(String[] args) 
	{
		K k1= new K();
		System.out.println("Hello World!");
	}
}

/*
compilation error
this() should be in first stmt which is in line no 13 
K.java:13: error: call to this must be first statement in constructor
                this(10);
                    ^
1 error


*/