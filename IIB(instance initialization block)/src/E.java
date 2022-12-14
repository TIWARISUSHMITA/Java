class  E
{
	{
		System.out.println("E-IIB1");
	}

	E()
	{
		System.out.println("E()");
	}

	{
		System.out.println("E-IIB2"); //IIB block
	
	}
	E(int i)
	{
		System.out.println("E(int)");
	
	}
	public static void main(String[] args) 
	{
		E d1 = new E();
		System.out.println("--------");
		
		E e2 = new E();
		System.out.println("------");
	}
}
/*
E-IIB1
E-IIB2
E()
--------
E-IIB1
E-IIB2
E()
------
IIB excutes nuteral content for every object creation
for every objet creation IIB specify new .....
all IIB is excuting from top to bottom
no matter which constructer we are using'
IIB excution is object bise
*/
