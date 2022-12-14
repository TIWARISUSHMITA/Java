class L 
{
	final int i ;//global value should be assignes with the expilcit value becouse of final
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
L.java:3: error: variable i not initialized in the default constructor
        final int i ;//global value
                  ^
1 error
final global variable can not be servive with the default value
the global variable which is final should we assigned with a value
even this is in constructor , IIB,SIB 

*/