class B
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 20;
		do
		{
			System.out.println("do -while : " +i);
			i++ ;
		}
		while (i <= 5 );
		System.out.println("main end : " +i);
	}
}

/*
it is not bothering a
in this (while (i <= 5 );) loop have to semicolomn otherwise getting error

*/