class M56 
{
	static String s2 = "";
	public static void main(String[] args) 
	{
		String s1 = "hello";
		reverse(s1, s1.length() - 1);
		System.out.println(s2);
	}
	static void reverse(String str, int index)
	{
		if (index == -1)
		{
			return;
		}
		s2 += str.charAt(index);
		index-- ;
		reverse(str , index);
	
	}
}
/*
to reverse the string using recursive algo

olleh
*/
