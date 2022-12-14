class A 
{
	A()
	{
		System.out.println("A()");
	}
}
class J extends A
{
	J()
	{
		System.out.println("J()");
		super(); //should be first or above of this line
	}
	public static void main(String[] args) 
	{
		J j1 = new J();
		System.out.println("Hello World!");
	}
}
/*
J.java:13: error: call to super must be first statement in constructor
                super();
                     ^
1 error

super () is must be in the first stmt   but the in line no 13 the super() is avilable in the  below of the stmt 
so its getting error


*/