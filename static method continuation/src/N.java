class N 
{
	static int i = 10;
	public static void main(String[] args) 
	{
		int i = 100;
		System.out.println(i); //100
		System.out.println(N.i); //10 it always global 
	}
}

/*
static is only for the global members not for the local members
if we want to print the value of global and local  so use along with the class name in the given variable so it prints the global variable with the help of class name.local variable(N.i)


*/