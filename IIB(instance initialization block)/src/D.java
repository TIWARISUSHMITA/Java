class  D
{
	D()
	{
		System.out.println("D()");
	}

	{
		System.out.println("IIB"); //instance block or instance initializer block 
	
	}
	D(int i)
	{
		System.out.println("D-IIB");
	
	}
	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println("--------");
		
		D d2 = new D();
		System.out.println("------");
	}
}
/*
for every object creation IIB excuting
IIB
D()
--------
IIB
D()
------
no matter which cons we are usinng to creat an object
IIB excuts one time

not only the cons it use an iisomting....
*/
