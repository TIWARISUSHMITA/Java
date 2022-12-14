class  A
{
	A(int i)
	{
	
	}
}
class Z extends A
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
compiltion error
compiler only giving the default constructor with no argument
but in line no 3 the constructor have an argument so getting error
*/
