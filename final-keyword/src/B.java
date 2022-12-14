class B 
{
	public static void main(String[] args) 
	{
		final int i ;
		i = 10;
		int j = 10;

			i = 10;
			j = 20;
		System.out.println(i);
		System.out.println(j);
	}
}
/*
line no 6 is proper

but line no 9 is getting error
B.java:9: error: variable i might already have been assigned
                        i = 10;
                        ^
1 error
*/
