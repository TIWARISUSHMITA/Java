class E 
{
	E()
	{
		System.out.println("E()");
	}
	public static void main(String[] args) 
	{
		E e1 = new E();
		System.out.println("------");
		E e2 = new E();
		System.out.println("------");
		E e3 = new E();
		System.out.println("------");
		E e4 = e1;
		E e5 = e1;
		E e6 = e2;
	}
}
/*
in this only three object is creating
and three constructer are creating
becouse according to object and their counts constructer running
E()
------
E()
------
E()
------
according to object construcer is running means here there are three object is created thats why constructer is excutinig in three times

*/