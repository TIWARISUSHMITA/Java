class  M4
{
	static C test1()
	{
		return new C();

	}
	static E test1()
	{
		E e1 = new E();
		return e1;
	}
	public static void main(String[] args) 
	{
		C obj1 = test1();
		E obj2 = test2();
		System.out.println("done");
	}
}
