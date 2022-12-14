class X 
{
	X()
	{
		System.out.println("X():" + i);
	}
	{
		X x1 = new X();
		System.out.println("IIB:" + x1.i);
	}
	int i ;
	public static void main(String[] args) 
	{
		System.out.println("done");
		X obj = new X();


	}
}
/*
in case of this class in the main method 
the object is creating same as in the line no 8 which is the part of the IIB 

in  the constructer and IIB body we should not creat the object in the same class
run time error
*/