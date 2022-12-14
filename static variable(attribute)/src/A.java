class A 
{
	static int i;
	static 
	{
		System.out.println(i);  //direct read 
		i = 10 ; //direct write 
		test();
	}
	public static void test()
	{
		System.out.println(i);  //indirect read
		i =  20; //indirect write
	}
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
/*
direct read use the value of i
direct write providing a value of i
in the inialition we should 
inside SIB we use direct read
if test method calling under initializer it comes indirect 

*/