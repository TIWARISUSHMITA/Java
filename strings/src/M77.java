class M77
{
	public static void main(String[] args) 
	{
		int num = 12345678;
		String s1 = String.format("num is %(d", num);
		System.out.println(s1);
	}
}
/*
if we want to print any num  in ( it prints negative

num is 12345678
*/