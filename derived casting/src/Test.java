class Test
{
	public static void method(Object obj)
	{
		C c1 = (C) obj;
		System.out.println("converted into C");
	}
	public static void main(String[] args)
	{
		if (obj instanceof C)
		{
			C c1 = (C) obj;
			System.out.println("converted into C");
		}
		System.out.println("method2 end");
	}
}
/*

*/