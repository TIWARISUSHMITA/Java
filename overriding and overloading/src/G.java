class A
{
	public void test()
	{
	
		System.out.println("from A.test");
		
	}
}
class  G extends A
{
	protected void test()
	{
		System.out.println("from G.test()");
		
	}
	public static void main(String[] args) 
	{
		G obj = new G();
		obj.test();
		System.out.println("done");
	}
}
/*
error: test() in G cannot override test() in A
        protected void test()
                       ^
  attempting to assign weaker access privileges; was public
1 error
super class method access level is public is narrowing
return type is same as super class method and sub class method
access level is same or wider in sub class to follow overriding



*/
