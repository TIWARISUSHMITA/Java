class  A
{
	int i; //non-static or instance variable
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
/*
A.java:6: error: non-static variable i cannot be referenced from a static context
                System.out.println(i);
                                   ^
1 error
non -satic i while using in main method which  main is static

*/