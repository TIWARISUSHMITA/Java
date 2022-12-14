class X
{
	X()
	{
	System.out.println("X()");
	super();
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main end");
	}
}
/*
compilation error
X.java:6: error: call to super must be first statement in constructor
        super();
             ^
1 error

super()and this()
should be first stmt in the body
*/