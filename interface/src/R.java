interface A
{
	void test1();
}
class R implements A
{
	void test1()
	{
	
	}
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}
/*
test1  is not implementing in class R
R.java:7: error: test1() in R cannot implement test1() in A
        void test1()
             ^
  attempting to assign weaker access privileges; was public
1 error
*/