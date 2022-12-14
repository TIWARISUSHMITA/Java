class M7 
{
	public static void main(String[] args) 
	{
		String s1 = "Hi India";
		String s2 = "Hi "India""; // this not allowed
		System.out.println(s1);
		System.out.println(s2);
	}
}
/*
M7.java:6: error: ';' expected
                String s2 = "Hi "India"";
                                 ^
M7.java:6: error: ';' expected
                String s2 = "Hi "India"";
                                      ^
2 errors
*/