class M74
{
	public static void main(String[] args) 
	{
		int num = 123456;
		String s1 = String.format("num is (%-20d)", num);
		System.out.println(s1);
	}
}
/*
num is (123456              )

- is representing in the 20 white spaces in the left side
*/