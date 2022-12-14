class A
{
	void test()
	{
		System.out.println("A.test()");
	}

}
class  J extends A
{
	 void test()
	{
		System.out.println("from J.test() begin");
		super.test();
		System.out.println("from J.test() end");
		
	}
	public static void main(String[] args) 
	{
		J obj = new J();
		obj.test();
		System.out.println("done");
	}
}
/*
from J.test() begin
A.test()
from J.test() end
done
this and super are only avilable in non-static methods
not to static

*/
