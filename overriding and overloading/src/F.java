class A
{
	void test()
	{
	
		System.out.println("from A.test");
		
	}
}
class  F extends A
{
	public void test()
	{
		System.out.println("from F.test()");
		
	}
	public static void main(String[] args) 
	{
		F obj = new F();
		obj.test();
		System.out.println("done");
	}
}
/*
from F.test()
done



*/
