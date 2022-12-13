class	B
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		while (i<=5)
		{
			System.out.println("while loop body");
			i++;  //in last i value is 6
		}
		System.out.println("main end" +i);  //6
	}
}
/*
while loop doesn't having three event section
in case of while loop any where we can achive the initializion 
but this is a fixed location in the body of while loop we can do any changes
*/