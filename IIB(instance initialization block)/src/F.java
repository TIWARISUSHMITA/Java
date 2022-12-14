class  F
{

	F()
	{
		this(90);
		System.out.println("E()");
	}


	F(int i)
	{
		System.out.println("F(int)");
	
	}
	{
		System.out.println("F-IIB");
	
	}
	public static void main(String[] args) 
	{
		F f1 = new F();
		System.out.println("--------");
		F f2 = new F(90);

	}
}
/*
all IIB is excuting from top to bottom
no matter which constructer we are using'
IIB excution is object bise
IIB excutes only one for one object creation
while object creating all cocstruction are using becouse of (this)
no matter hwo many constructor are using in one object


F-IIB
F(int)
E()
--------
F-IIB
F(int)

*/
