class Y
{
	Y()
	{
		super(10);
	}
	public static void main(String[] args) 
	{
		System.out.println("hello world!");

	}
}
/*
Y.java:5: error: constructor Object in class Object cannot be applied to given types;
                super(10);
                ^
  required: no arguments
  found: int
  reason: actual and formal argument lists differ in length
1 error

super()and this()
should be first stmt in the body
*/