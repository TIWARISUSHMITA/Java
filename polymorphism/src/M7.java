 interface A
{
	abstract void test();
}

class  B implements A
{
	public void test()
	{
		System.out.println("from B.test");
	}

}
class  C implements A
{
	public void test()
	{
		System.out.println("from C.test");
	}

}
class M7
{
	public static void main(String[] args) 
	{
		B b1 = new B(); 
		C c1 = new C();
		A[] elements = { b1, c1};	
		for (A element : elements) 
								
		{
			element.test();
		}
	}
}
/*

*/