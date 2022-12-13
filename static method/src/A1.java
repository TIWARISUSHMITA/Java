class A1 
{
	public static void main(String[] args) 
	{
		int  a = 30;
		int  b = 45;
		System.out.println("befor swapping : a= " +a + "and b = " + b );
		swapFunction(a,b);
		System.out.println("after swapping : a " + a + "and b " +b  );
	}

	public static void swapFunction(int a , int b)
	{
		System.out.println("befor swapping  :a = " +a+ "and b=" +b);
		int c = a;
		a = b;
		b = c;

		System.out.println("after swapping  :a = " +a+ "and b=" +b);
	}
}
/*
befor swapping : a= 30and b = 45
befor swapping  :a = 30and b=45
after swapping  :a = 45and b=30
after swapping : a 30and b 45


*/