class M76
{
	public static void main(String[] args) 
	{
		int num = 123456;
		String s1 = String.format("num is (%0,20d)", num);
		System.out.println(s1);
	}
}
/*
o is using one flag the, then another flag
(, )is used for multiple digits

num is (0000000000000123,456)
*/