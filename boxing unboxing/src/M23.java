class M23
{
	static void test(Byte i) //first method
	{
		System.out.println("test(Byte)");
	}
	static void test(int i) //second method
	{
		System.out.println("test(int)");
	}
	public static void main(String[] args) 
	{
		byte b = 10;
		test(b);
		System.out.println("done");
	}
}
/*
test(int)
done

here int ia printing becouse second test method means int is wide than byte
widning is first preference then second 

*/