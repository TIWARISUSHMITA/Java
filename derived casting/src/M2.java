class M2 
{
	public static void main(String[] args) 
	{
		A a1 = null;
		A a2 = null;
		B b1 = null , b2 = null , b3 = null;
		a1 = a2;
		a2 = a1;
		b1 =b2;
		b2 = b1;
		b3 = b2;
		b3 = b1;
			C c1 = new C(), c2 = new C();
		c1 = c2 ;
		c1 = c3 ;
		c3 = c1;

		System.out.println("done");
	}
}
