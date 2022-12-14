class T
{
	int i = test();
	int j =20 ;
	int test()
	{
		return j;
	}
	public static void main(String[] args) 
	{
		T t1 = new T();
		System.out.println(t1.i+","+ t1.j);

	}
}
/*

*/
