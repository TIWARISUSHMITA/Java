class  Z
{
	Z() //constructor
	{
		Z z1 = new Z();  //object
	}
	public static void main(String[] args)  //main method
	{
		Z obj = new Z(); //object
		System.out.println("Hello World!");
	}
}
/*
same object creating in the constructor and main method
run time error

*/