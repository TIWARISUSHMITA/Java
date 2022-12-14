class  C
{
	C()
	{
		System.out.println("C()"); //constructor block
	}

	{
		System.out.println("IIB"); // IIB block
	
	}
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("--------");
		C c2 = new C();
		System.out.println("------");
	}
}
/*
for every object creation IIB excuting
IIB
C()
--------
IIB
C()
------
not only the cons it use an iisomting....
in constructor block the constructer should be sameas class without any return typr
and in instance initialzer block (IIB) it dont have any name it have only ({ stmt or logic } currly braces and stmt or logic)
which is in line no 8 to 11 is IIB  or instance block
*/
