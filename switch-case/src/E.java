class E 
{
	public static void main(String[] args) 
	{
		String s1  = "hello";
		String s2  = "test";
		String s3 = "testtesttesttesttesttesttesttest";
		String s4 = "";
		String s5 = "hello";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s4.hashCode());
	}
}
/*
99162322
3556498
360540304
0

*/