class M57 
{
	public static void main(String[] args) 
	{
		String s1 = "hello";
		System.out.println(s1);
		String s2 = reverse(s1, s1.length() -1);
		System.out.println(s2);
	}
	static String reverse(String str, int index)
	{
		if (index == -1)
		{
			return "";
		}
		return str.charAt(index) +  reverse(str, --index);
	
	}
}
/*
without a global value
to reverse the string using recursive algo

hello
olleh
*/
