class A
{
	void test()
	{
	
		System.out.println("from A.test");
		
	}
}
class  E extends A
{
	int test(boolean d)
	{
		System.out.println("from E.test()");
		return 10;
	}
	public static void main(String[] args) 
	{
		E obj = new E();
		obj.test();
		System.out.println("done");
	}
}
/*
if sub class method's signature same as the super class method then the super class method is attempting to overrid
same method and same sighnature in sub class and super class is known as overriding
while method is overrid same return type should be


from A.test
done

but in case of overloading any return type is allowed
overriding is not proper becouse of diffrent return typr

*/
