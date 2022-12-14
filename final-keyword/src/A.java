class  A
{
	public static void main(String[] args) 
	{
		final int i = 10;
		int j = 10;

		i = 10;
		j = 20;
		System.out.println("i");
		System.out.println("j");
	}
}

/*
final variable should not be reinitialize even though we are iniatialize with the same value 
we will bw getting compilation error
at ine no 8 getting compilation error because of reinitializtion
final variable can not be allowed to reinitialize

A.java:8: error: cannot assign a value to final variable i
                i = 10;
                ^
1 error
*/