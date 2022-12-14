class H
{
	int x ;  //global
	H(int x) //constructor
	{
		//x = x; local
		this.x = x; //
	}
	public static void main(String[] args) 
	{
		H h1 = new H(30); 
		System.out.println(h1.x);
		H h2 = new H(310); 
		System.out.println(h2.x);
		H h3 = new H(301); 
		System.out.println(h3.x);
				
	}
}
/*
local x value assigning into global x

30
310
301

*/