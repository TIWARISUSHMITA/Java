class U 
{
	int i ;
	public static void main(String[] args) 
	{
		U u1 = new U();
		u1.i = 10;
		U u2 = new U();
		U u3 = new U();
		u3.i = 20;
		System.out.println(u1.i);
		System.out.println(u2.i);
		System.out.println(u3.i);
	}
}

/*
10
0
20

*/