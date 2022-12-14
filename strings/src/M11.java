class M11
{
	public static void main(String[] args) 
	{
		String s1 = "abc  xyz";
		String s2 = "abc  \\ xyz"; //in place of \n(new line ) we can use \\ which is also meant like scape the other character
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.length());
		System.out.println(s2.length());
	}
}
/*
abc  xyz
abc  \ xyz
8
10

*/