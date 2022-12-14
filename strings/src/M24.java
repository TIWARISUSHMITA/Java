class M24 
{
	public static void main(String[] args) 
	{
		String s1 = "xyz";
		System.out.println(s1);
		s1.concat("Hello"); //generates new string
		System.out.println(s1);
	}
}
/*
xyz //befre cnocat
xyz //after concat


concat method internallu adding the string is immutable we can channge
string valuee is change we can not change the string object

*/