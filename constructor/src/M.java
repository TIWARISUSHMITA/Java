class M
{
	M()
	{
		System.out.println("M()");
	}
	M(int i)
	{
		System.out.println("M(int)");
	}
	public static void main(String[] args) 
	{
		M m1 = new M(); 
		System.out.println("----------!");
		M m2 = new M(20); 
		System.out.println("----------!");	
		M m3= new M(120); 
		System.out.println("----------!");	
		M m4 = new M(); 
		System.out.println("----------!");
		

				
	}
}
/*
a class can have any nomber of constructors
costructor overloading
desgning multiple constructor in the same class is nothing but constructor overloading
we should change a number of argument like
in line no 7
the first one constructor have no argument
wherever the second one have argument
for one object creation multiple constructor can not be use


M()
----------!
M(int)
----------!
M(int)
----------!
M()
----------!
*/