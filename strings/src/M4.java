class M4 
{
	public static void main(String[] args) 
	{
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1.equals(s2));

		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println(s3.equals(s4));
	}
}
/*
true
true

s1 s2 are without new operater
equals method is also object class inherited to string class

s3 and s4 are with new object
equals () checking the content of s1 s2
equals () checking the content of s3 s4 it we are cecking the content of s1 and s3 it returning false

*/