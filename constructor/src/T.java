class T 
{
	T()
	{
		this(90); //calling below constructer
	}
	T(int i)
	{
		this(); //calling uper constructer
	}
}
/*

T.java:7: error: recursive constructor invocation
        T(int i)
        ^
1 error
(this )is giving compilation error
first constructor calling second one 
second one calling first one
it look like   a cyclic way like recursion


*/