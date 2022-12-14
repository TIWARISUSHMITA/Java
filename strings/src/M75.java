class M75
{
	public static void main(String[] args) 
	{
		int num = 123456;
		String s1 = String.format("num is (%-020d)", num);
		System.out.println(s1);
	}
}
/*
not a correct combination getting an exception

- is representing in the 20 white spaces in the left side
*/