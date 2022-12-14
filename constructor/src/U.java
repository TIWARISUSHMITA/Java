class  U
{
	U()
	{
		this(); // calling it self
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
it is also givingb a compilation error

U.java:3: error: recursive constructor invocation
        U()
        ^
1 error
cyclic invocation not allow  this calling stmt

*/
