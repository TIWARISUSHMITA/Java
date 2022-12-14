class  D
{
	private void test()
	{
	
	}

}
class E
{
	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.test();
		System.out.println("done");
	}
}
/*
private member of D can not used in the E class
compile time error
E.java:14: error: test() has private access in D
                d1.test();
                  ^
1 error

*/