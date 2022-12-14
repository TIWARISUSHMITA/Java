class M54 
{
	public static void main(String[] args) 
	{
		String s1 = "hello";
		System.out.println(s1);
		char[] chars = s1.toCharArray();
		char ch;
		for (int i = 0; i < chars.length / 2 ; i++)
		{
			ch = chars[i];
			chars[i] = chars[chars.length - 1 - i];
			chars[chars.length -1 - i] = ch;
		}
		s1 = new String(chars);//redefine a string object
		System.out.println(s1);

	}
}
/*
to read all the char into an array using tocharArray()
hello
olleh
through for loop reversing the content
content of the array is
*/