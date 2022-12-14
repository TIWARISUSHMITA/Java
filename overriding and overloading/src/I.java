class A
{
	void test()
	{
	
	}

}
class  I extends A
{
	 static void test()
	{
		System.out.println("from I.test()");
		
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
/*
overriding means replacment
non static method can not be override in the satic
while static can be override in the non-static
I.java:11: error: test() in I cannot override test() in A
         static void test()
                     ^
  overriding method is static
1 error
*/
