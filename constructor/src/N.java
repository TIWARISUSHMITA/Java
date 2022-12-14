class N
{

	N(int i)
	{
		System.out.println("N(int)");
	}	
	N(String i)
	{
		System.out.println("N(String)");
	}
	public static void main(String[] args) 
	{
		N n1 = new N(90); 
		System.out.println("----------!");	
		N n2= new N("hello"); 
		System.out.println("----------!");	

		

				
	}
}
/*
contructor overloading
a class can have any nomber of constructors
costructor overloading
desgning multiple constructor in the same class is nothing but constructor overloading
constructor overloading mean the class is same but argument is different like int String etc .....
we should change a number of argument like
for one object creation multiple constructor can not be use

N(int)
----------!
N(String)
----------!


*/