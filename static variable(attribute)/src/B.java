class B
{
	static 
	{
		System.out.println(i);  //direct read 
		i = 10 ; //direct write 
		test();
	}
	static int i;
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
compile time error
illegal forward reference
if we are using any variable in direct read that is illegal forward reference
while compiling compiler is checking  ..
before notified the jvm direct  is not allow
no global variable can be read directly before notified jvm
line no 5 is getting error
only  direct read is not allowed before notified the JVM


*/