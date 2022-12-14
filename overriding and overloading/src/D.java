class A
{
	void test()
	{
	
		System.out.println("from A.test");
		
	}
}
class  D extends A
{
	int test()
	{
		System.out.println("from D.test()");
		return 10;
	}
	public static void main(String[] args) 
	{
		D obj = new D();
		obj.test();
		System.out.println("done");
	}
}
/*
if sub class method's signature same as the super class method then the super class method is attempting to overrid
same method and same sighnature in sub class and super class is known as overriding
while method is overrid same return type should be

D.java:12: error: test() in D cannot override test() in A
        int test()
            ^
  return type int is not compatible with void
1 error
overriding is not proper becouse of diffrent return typr

*/
