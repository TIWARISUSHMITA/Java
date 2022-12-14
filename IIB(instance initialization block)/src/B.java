class  B
{
	B()
	{
		this(9);
		System.out.println("B()");
	}
	B(int i)
	{
		this(10,i);
		System.out.println("B(int)");
	}
	B(int i,int j )
	{
		System.out.println("B(int , int)");
	}
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("---------");
		B b2 = new B(20);
		System.out.println("---------");	
		B b3 = new B(20 , 40);
		System.out.println("---------");
	}
}
/*
B(int , int)
B(int)
B()
---------
B(int , int)
B(int)
---------
B(int , int)
---------
proper cons overloading
for first object creation
total object is excution then two then only one
*/
