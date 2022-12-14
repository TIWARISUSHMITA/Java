class M26 
{
	public static void main(String[] args) 
	{
		A a1 = new C();
		if (a1 instanceof A)
		{
			A a2 = (A) a1;
			System.out.println("converted into A type");
		}
		if (a1 instanceof B)
		{
			B a1 = (B) a1;
			System.out.println("converted into B type");
		}
		if (a1 instanceof C)
		{
			C a1 = (C) a1;
			System.out.println("converted into C type");
		}			
		if (a1 instanceof D)
		{
			D a1 = (D) a1;
			System.out.println("converted into D type");
		}	
		if (a1 instanceof E)
		{
			E a1 = (D) E1;
			System.out.println("converted into E type");
		}	
	
	}
}
