interface A
{

}
class M
{
	public static void main(String[] args)
	{
	System.out.println("main begin");
	A a1 = new A();
	System.out.println("main end");
	}
}
/*
in interface we can creat an object  becouse interface is 100% abstract and in abstract we can not creat an object

M.java:10: error: A is abstract; cannot be instantiated
        A a1 = new A();
               ^
1 error

*/