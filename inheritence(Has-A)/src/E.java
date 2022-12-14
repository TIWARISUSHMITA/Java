 class  A
{
	 int i ; 
}
class E
{
	A obj; //non static or global

	public static void main(String[] args) 
	{ 
		//System.out.println(obj); 
		E e1 = new E();
		System.out.println(e1.obj.i);
		A a1 = new A();
		System.out.println(a1.i);
	}
}
/*

Exception in thread "main" java.lang.NullPointerException
        at E.main(E.java:13)

		null pointer exception at line no 13
		compilation is secces while running we will be getting null pointer exception 




*/ 