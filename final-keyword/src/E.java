class E 
{
	public static void main(String[] args) 
	{
		final int[] elements = new int[10];
		elements = new int[10];
		System.out.println("Hello World!");
	}
}
/*
we can nnot reinitialize array reference 
if it is decleared as final
E.java:6: error: cannot assign a value to final variable elements
                elements = new int[10];
                ^
1 error

*/